package android.arch.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class MethodCallsLogger
{
  private Map<String, Integer> cL = new HashMap();

  public boolean approveCall(String paramString, int paramInt)
  {
    boolean bool = true;
    Integer localInteger = (Integer)this.cL.get(paramString);
    int i;
    int j;
    if (localInteger != null)
    {
      i = localInteger.intValue();
      if ((i & paramInt) == 0)
        break label70;
      j = 1;
      label39: this.cL.put(paramString, Integer.valueOf(i | paramInt));
      if (j != 0)
        break label76;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label70: j = 0;
      break label39;
      label76: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.MethodCallsLogger
 * JD-Core Version:    0.6.2
 */