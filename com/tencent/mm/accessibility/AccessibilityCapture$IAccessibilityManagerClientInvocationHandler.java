package com.tencent.mm.accessibility;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class AccessibilityCapture$IAccessibilityManagerClientInvocationHandler
  implements InvocationHandler
{
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118624);
    paramObject = paramMethod.getName();
    paramMethod = paramMethod.getParameterTypes();
    if ((paramObject.equals("setState")) && (paramMethod.length == 1) && (paramMethod[0].equals(Integer.TYPE)))
    {
      paramObject = paramArrayOfObject[0];
      if ((paramObject == null) || (!(paramObject instanceof Integer)))
        AppMethodBeat.o(118624);
    }
    while (true)
    {
      return null;
      int i = ((Integer)paramObject).intValue();
      AccessibilityCapture.access$600().i("MicroMsg.AccessibilityCapture", "setState %d", new Object[] { Integer.valueOf(i) });
      AccessibilityCapture.access$700(i);
      AppMethodBeat.o(118624);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.AccessibilityCapture.IAccessibilityManagerClientInvocationHandler
 * JD-Core Version:    0.6.2
 */