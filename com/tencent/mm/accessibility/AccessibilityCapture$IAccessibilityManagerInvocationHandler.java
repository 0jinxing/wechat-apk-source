package com.tencent.mm.accessibility;

import android.view.accessibility.AccessibilityEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class AccessibilityCapture$IAccessibilityManagerInvocationHandler
  implements InvocationHandler
{
  private final Object originalInstance;

  private AccessibilityCapture$IAccessibilityManagerInvocationHandler(Object paramObject)
  {
    this.originalInstance = paramObject;
  }

  public Object getOriginalInstance()
  {
    return this.originalInstance;
  }

  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118625);
    String str = paramMethod.getName();
    paramObject = paramMethod.getParameterTypes();
    if ((str.equals("sendAccessibilityEvent")) && (paramObject.length == 2) && (paramObject[0].equals(AccessibilityEvent.class)) && (paramObject[1].equals(Integer.TYPE)))
    {
      paramObject = paramArrayOfObject[0];
      if ((paramObject == null) || (!(paramObject instanceof AccessibilityEvent)))
      {
        AppMethodBeat.o(118625);
        paramObject = null;
      }
    }
    while (true)
    {
      return paramObject;
      paramObject = (AccessibilityEvent)paramObject;
      if (AccessibilityCapture.access$200())
      {
        if ((AccessibilityCapture.access$300(paramObject)) && (AccessibilityCapture.access$400(paramObject)))
          AccessibilityCapture.access$500(AccessibilityEvent.obtain(paramObject));
        paramObject = paramMethod.invoke(this.originalInstance, paramArrayOfObject);
        AppMethodBeat.o(118625);
      }
      else if ((AccessibilityCapture.access$300(paramObject)) && (AccessibilityCapture.access$400(paramObject)))
      {
        AccessibilityCapture.access$500(paramObject);
        paramObject = Boolean.FALSE;
        AppMethodBeat.o(118625);
      }
      else
      {
        AccessibilityCapture.access$600().v("MicroMsg.AccessibilityCapture", "filter a event: %s", new Object[] { AccessibilityEvent.eventTypeToString(paramObject.getEventType()) });
        paramObject = Boolean.TRUE;
        AppMethodBeat.o(118625);
        continue;
        AccessibilityCapture.access$600().i("MicroMsg.AccessibilityCapture", "[oneliang]original accessibility instance: %s,method name:%s", new Object[] { this.originalInstance, str });
        if (this.originalInstance != null)
        {
          paramObject = paramMethod.invoke(this.originalInstance, paramArrayOfObject);
          AppMethodBeat.o(118625);
        }
        else
        {
          AppMethodBeat.o(118625);
          paramObject = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.AccessibilityCapture.IAccessibilityManagerInvocationHandler
 * JD-Core Version:    0.6.2
 */