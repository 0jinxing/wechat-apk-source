package org.xwalk.core;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.a;
import com.tencent.xweb.util.e;

public class RuntimeToSdkChannel
{
  public static final String KEY_GET_CONFIG_CMD = "GET_CONFIG_CMD";
  public static final String KEY_INVOKE_METHOD = "INVOKE_INSTANCE_METHOD";
  public static final String KEY_STATIC_METHOD = "INVOKE_STATIC_METHOD";

  public static void initRuntimeToSdkChannel()
  {
    try
    {
      AppMethodBeat.i(85523);
      if (XWalkCoreWrapper.getInstance() == null)
        AppMethodBeat.o(85523);
      while (true)
      {
        return;
        XWalkCoreWrapper.getInstance();
        RuntimeToSdkChannel.1 local1 = new org/xwalk/core/RuntimeToSdkChannel$1;
        local1.<init>();
        XWalkCoreWrapper.invokeRuntimeChannel(80005, new Object[] { local1 });
        AppMethodBeat.o(85523);
      }
    }
    finally
    {
    }
  }

  public static Object onRuntimeCalled(String paramString, Object paramObject)
  {
    AppMethodBeat.i(85524);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        AppMethodBeat.o(85524);
        paramString = null;
      case 0:
      case 1:
      case 2:
      }
      break;
    case 59342662:
    case 51739140:
    case 886431819:
    }
    while (true)
    {
      return paramString;
      if (!paramString.equals("GET_CONFIG_CMD"))
        break;
      i = 0;
      break;
      if (!paramString.equals("INVOKE_INSTANCE_METHOD"))
        break;
      i = 1;
      break;
      if (!paramString.equals("INVOKE_STATIC_METHOD"))
        break;
      i = 2;
      break;
      if (!(paramObject instanceof String[]))
      {
        paramString = "";
        AppMethodBeat.o(85524);
      }
      else
      {
        paramString = (String[])paramObject;
        if (paramString.length < 2)
        {
          paramString = "";
          AppMethodBeat.o(85524);
        }
        else if (TextUtils.isEmpty(paramString[1]))
        {
          paramString = a.ava(paramString[0]);
          AppMethodBeat.o(85524);
        }
        else
        {
          paramString = a.iG(paramString[0], paramString[1]);
          AppMethodBeat.o(85524);
          continue;
          if (!(paramObject instanceof Object[]))
          {
            AppMethodBeat.o(85524);
            paramString = null;
          }
          else
          {
            paramObject = (Object[])paramObject;
            if ((paramObject == null) || (paramObject.length < 2))
            {
              AppMethodBeat.o(85524);
              paramString = null;
            }
            else if (!(paramObject[0] instanceof Object))
            {
              AppMethodBeat.o(85524);
              paramString = null;
            }
            else
            {
              if ((paramObject[1] instanceof String))
                break label285;
              AppMethodBeat.o(85524);
              paramString = null;
            }
          }
        }
      }
    }
    label285: paramString = paramObject[0];
    if ((paramObject[0] instanceof String))
      paramString = e.avm((String)paramObject[0]);
    while (true)
    {
      if (paramString == null)
      {
        AppMethodBeat.o(85524);
        paramString = null;
        break;
      }
      String str = (String)paramObject[1];
      if (2 == paramObject.length)
      {
        paramString = e.n(paramString, str);
        AppMethodBeat.o(85524);
        break;
      }
      if (4 == paramObject.length)
      {
        if (!(paramObject[2] instanceof Class[]))
        {
          paramString = e.n(paramString, str);
          AppMethodBeat.o(85524);
          break;
        }
        if (!(paramObject[3] instanceof Object[]))
        {
          paramString = e.n(paramString, str);
          AppMethodBeat.o(85524);
          break;
        }
        paramString = e.c(paramString, str, (Class[])paramObject[2], (Object[])paramObject[3]);
        AppMethodBeat.o(85524);
        break;
      }
      paramString = e.n(paramString, str);
      AppMethodBeat.o(85524);
      break;
      if (!(paramObject instanceof Object[]))
      {
        AppMethodBeat.o(85524);
        paramString = null;
        break;
      }
      paramObject = (Object[])paramObject;
      if ((paramObject == null) || (paramObject.length < 2))
      {
        AppMethodBeat.o(85524);
        paramString = null;
        break;
      }
      if (!(paramObject[0] instanceof String))
      {
        AppMethodBeat.o(85524);
        paramString = null;
        break;
      }
      if (!(paramObject[1] instanceof String))
      {
        AppMethodBeat.o(85524);
        paramString = null;
        break;
      }
      str = (String)paramObject[0];
      paramString = (String)paramObject[1];
      if (2 == paramObject.length)
      {
        paramString = e.iJ(str, paramString);
        AppMethodBeat.o(85524);
        break;
      }
      if (4 == paramObject.length)
      {
        if (!(paramObject[2] instanceof Class[]))
        {
          paramString = e.iJ(str, paramString);
          AppMethodBeat.o(85524);
          break;
        }
        if (!(paramObject[3] instanceof Object[]))
        {
          paramString = e.iJ(str, paramString);
          AppMethodBeat.o(85524);
          break;
        }
        paramString = e.b(str, paramString, (Class[])paramObject[2], (Object[])paramObject[3]);
        AppMethodBeat.o(85524);
        break;
      }
      paramString = e.n(str, paramString);
      AppMethodBeat.o(85524);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.RuntimeToSdkChannel
 * JD-Core Version:    0.6.2
 */