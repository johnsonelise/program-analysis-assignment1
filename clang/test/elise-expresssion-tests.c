// RUN: %clang_cc1 -verify %s

// expected-no-diagnostics

/* WG14 N617: yes
 * reliable integer division
 */


/*
    tests needed
   - pos values
   - neg values
   - overflow? (call a more times than b)
 */

int add_one(int y){ // if y = 0 new test
    static int x = 0;

    if(!y){ x= 0; }
    x++;

    return x;
}

void test(void) {
  _Static_assert(59 / 4 == 14, "we didn't truncate properly");
  _Static_assert(59 / -4 == -14, "we didn't truncate properly");
  _Static_assert(-59 / 4 == -14, "we didn't truncate properly");
  _Static_assert(-59 / -4 == 14, "we didn't truncate properly");

  // Might as well test % for the quotient.
  _Static_assert(59 % 4 == 3, "we didn't truncate properly");
  _Static_assert(59 % -4 == 3, "we didn't truncate properly");
  _Static_assert(-59 % 4 == -3, "we didn't truncate properly");
  _Static_assert(-59 % -4 == -3, "we didn't truncate properly");

  // Test the idiom for rounding up.
  _Static_assert((59 + (4 - 1)) / 4 == 15, "failed to 'round up' with the usual idiom");
  _Static_assert((59 + (4 - 1)) % 4 == 2, "failed to 'round up' with the usual idiom");
}

// void elisetest(void) {
  // _Static_assert([[0 add_one(0) 1]] == 1, "basic test 1 fail");
  // _Static_assert([[0 add_one(0) 3]] == 3, "basic test 2 fail");
// 
  // _Static_assert([[0 add_one(0) 0]] == 0, "no call test fail");
  // 
  // _Static_assert([[-3 add_one(0) -2]] == 1, "both negative test fail");
  // _Static_assert([[-1 add_one(0) 0]] == 1, "a negative test fail");
// 
  // _Static_assert([[2147483646 add_one(0) -2147483648]] == 2, "overflow test fail");
// }