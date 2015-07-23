namespace Test {
    public class TestClass {
        public string Name {get;set;}
        public void DoIt() {
            string s = DoIt2();
        }

        public string DoIt2() {
            return "test string";
        }
    }
}