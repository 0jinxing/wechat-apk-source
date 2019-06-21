package com.tencent.matrix.iocanary.b;

import com.tencent.matrix.c.c.a;
import com.tencent.matrix.iocanary.c.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends com.tencent.matrix.c.c
  implements InvocationHandler
{
  private final Object bWn;

  public b(c.a parama, Object paramObject)
  {
    super(parama);
    this.bWn = paramObject;
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    com.tencent.matrix.d.c.i("Matrix.CloseGuardInvocationHandler", "invoke method: %s", new Object[] { paramMethod.getName() });
    if (paramMethod.getName().equals("report"))
      if (paramArrayOfObject.length != 2)
      {
        com.tencent.matrix.d.c.e("Matrix.CloseGuardInvocationHandler", "closeGuard report should has 2 params, current: %d", new Object[] { Integer.valueOf(paramArrayOfObject.length) });
        paramObject = null;
      }
    while (true)
    {
      return paramObject;
      if (!(paramArrayOfObject[1] instanceof Throwable))
      {
        com.tencent.matrix.d.c.e("Matrix.CloseGuardInvocationHandler", "closeGuard report args 1 should be throwable, current: %s", new Object[] { paramArrayOfObject[1] });
        paramObject = null;
      }
      else
      {
        paramObject = a.getThrowableStack((Throwable)paramArrayOfObject[1]);
        if (cg(paramObject))
          com.tencent.matrix.d.c.d("Matrix.CloseGuardInvocationHandler", "close leak issue already published; key:%s", new Object[] { paramObject });
        while (true)
        {
          paramObject = null;
          break;
          paramMethod = new com.tencent.matrix.c.b(4);
          paramMethod.key = paramObject;
          paramArrayOfObject = new JSONObject();
          try
          {
            paramArrayOfObject.put("stack", paramObject);
            paramMethod.bWv = paramArrayOfObject;
            b(paramMethod);
            com.tencent.matrix.d.c.d("Matrix.CloseGuardInvocationHandler", "close leak issue publish, key:%s", new Object[] { paramObject });
            cf(paramObject);
          }
          catch (JSONException localJSONException)
          {
            while (true)
              com.tencent.matrix.d.c.e("Matrix.CloseGuardInvocationHandler", "json content error: %s", new Object[] { localJSONException });
          }
        }
        paramObject = paramMethod.invoke(this.bWn, paramArrayOfObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.b.b
 * JD-Core Version:    0.6.2
 */