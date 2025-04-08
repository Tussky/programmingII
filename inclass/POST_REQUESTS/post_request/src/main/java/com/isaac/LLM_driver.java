package com.isaac;

public class LLM_driver {
    public static void main(String[] args) {
        LLM llm = new LLM();

        String[] keys = {"llama3.2", "Hi how r u"};
        String response = llm.sendPOST(keys);
        System.out.println(response);
    }
}
