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
                strinput.FillterInteger("");
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
                strinput.FillterInteger(" *,");
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
            strinput.FillterInteger("034599");
            Assert.AreEqual(034599, strinput.GetInteger);


        }
        [TestMethod()]
        public void TestSampleInputA()
        {
            String2Int strinput = new String2Int();
            strinput.FillterInteger("abc573");
            Assert.AreEqual(573, strinput.GetInteger);

        }

        [TestMethod()]
        public void TestSampleInputB()
        {
            String2Int strinput = new String2Int();
            strinput.FillterInteger("a5b7c3");
            Assert.AreEqual(573, strinput.GetInteger);

        }

    }
}