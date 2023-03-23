module FrenchGreeter {
    requires Greeter.api;
    provides com.example.greeterapi.Greeter with com.example.frenchgreeter.FrenchGreeter;
}