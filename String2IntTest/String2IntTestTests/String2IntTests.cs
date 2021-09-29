using Microsoft.VisualStudio.TestTools.UnitTesting;
using String2IntTest;
using System;
using System.Collections.Generic;
using System.Text;

namespace String2IntTest.Tests
{
    [TestClass()]
    public class String2IntTests
    {
        [TestMethod()]
        public void TestNoInputData()
        {
            try
            {
                String2Int strinput = new String2Int();
                strinput.GetOnlyDigit("");
            }
            catch (ArgumentException e)
            {
                StringAssert.Contains(e.Message, "No input data");
            }

        }

        [TestMethod()]
        public void TestSpecialCharactersOnly()
        {
            try
            {
                String2Int strinput = new String2Int();
                strinput.GetOnlyDigit(" *,");
            }
            catch (ArgumentException e)
            {
                StringAssert.Contains(e.Message, "Output is null");
            }

        }


        [TestMethod()]
        public void TestIntegerOnly()
        {

            String2Int strinput = new String2Int();
            strinput.GetOnlyDigit("034599");
            Assert.AreEqual(034599, strinput.GetStr2Int);


        }
        [TestMethod()]
        public void TestSampleInputA()
        {
            String2Int strinput = new String2Int();
            strinput.GetOnlyDigit("abc573");
            Assert.AreEqual(573, strinput.GetStr2Int);

        }

        [TestMethod()]
        public void TestSampleInputB()
        {
            String2Int strinput = new String2Int();
            strinput.GetOnlyDigit("a5b7c3");
            Assert.AreEqual(573, strinput.GetStr2Int);

        }

    }
}