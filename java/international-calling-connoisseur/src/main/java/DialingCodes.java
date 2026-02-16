import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    HashMap<Integer, String> dialingCodesToCountryMap = new HashMap<Integer, String>();

    public Map<Integer, String> getCodes() {
        return dialingCodesToCountryMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodesToCountryMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodesToCountryMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(dialingCodesToCountryMap.containsKey(code) || dialingCodesToCountryMap.containsValue(country)) { return; }
        dialingCodesToCountryMap.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry: dialingCodesToCountryMap.entrySet()) {
            if(entry.getValue().equals(country)) return entry.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(dialingCodesToCountryMap.containsValue(country)) {
            Integer currentCode = findDialingCode(country);
            dialingCodesToCountryMap.remove(currentCode);
            dialingCodesToCountryMap.put(code, country);
        }
    }
}
