package com.tencent.mm.plugin.normsg.b;

import android.os.IInterface;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class b$b$1 extends b.e
{
  b$b$1(b.b paramb, IInterface paramIInterface, Integer paramInteger, View paramView)
  {
    super(paramb.oUG, paramIInterface);
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10394);
    Object localObject = paramMethod.getName();
    if (b.bWl().equals(localObject))
    {
      localObject = new ArrayList();
      if (paramArrayOfObject[0] != null)
        ((List)localObject).add((AccessibilityNodeInfo)paramArrayOfObject[0]);
      b.a(this.oUN.oUG, this.oUL.intValue(), this.oUM, (List)localObject);
      if (((List)localObject).isEmpty())
        paramArrayOfObject[0] = null;
    }
    while (true)
    {
      paramObject = super.invoke(paramObject, paramMethod, paramArrayOfObject);
      AppMethodBeat.o(10394);
      return paramObject;
      paramArrayOfObject[0] = ((List)localObject).get(0);
      continue;
      if (b.bWm().equals(localObject))
      {
        List localList = (List)paramArrayOfObject[0];
        localObject = localList;
        if (localList == null)
          localObject = new ArrayList();
        b.a(this.oUN.oUG, this.oUL.intValue(), this.oUM, (List)localObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.b.1
 * JD-Core Version:    0.6.2
 */