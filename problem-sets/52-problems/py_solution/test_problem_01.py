from unittest import TestCase

from problem_01 import even_odd


class Test(TestCase):
    def test_even_odd(self):
        assert even_odd(25) == "25 is odd."

    def test_an_even(self):
        assert even_odd(2)=="2 is even."