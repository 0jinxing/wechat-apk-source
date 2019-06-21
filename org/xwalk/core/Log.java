package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.c;

public class Log
{
  private static c m_log_callback = null;

  public static void SetLogCallBack(c paramc)
  {
    m_log_callback = paramc;
  }

  public static void d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4189);
    if (m_log_callback != null)
    {
      m_log_callback.d(paramString1, paramString2);
      AppMethodBeat.o(4189);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4189);
    }
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4185);
    if (m_log_callback != null)
    {
      m_log_callback.e(paramString1, paramString2);
      AppMethodBeat.o(4185);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4185);
    }
  }

  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(4184);
    if (m_log_callback != null)
    {
      m_log_callback.e(paramString1, paramString2);
      AppMethodBeat.o(4184);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4184);
    }
  }

  public static void f(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4183);
    if (m_log_callback != null)
    {
      m_log_callback.e(paramString1, paramString2);
      AppMethodBeat.o(4183);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4183);
    }
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4188);
    if (m_log_callback != null)
    {
      m_log_callback.i(paramString1, paramString2);
      AppMethodBeat.o(4188);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4188);
    }
  }

  public static void v(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4190);
    if (m_log_callback != null)
    {
      m_log_callback.v(paramString1, paramString2);
      AppMethodBeat.o(4190);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4190);
    }
  }

  public static void w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4186);
    if (m_log_callback != null)
    {
      m_log_callback.w(paramString1, paramString2);
      AppMethodBeat.o(4186);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4186);
    }
  }

  public static void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(4187);
    if (m_log_callback != null)
    {
      m_log_callback.w(paramString1, paramString2);
      AppMethodBeat.o(4187);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(4187);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.xwalk.core.Log
 * JD-Core Version:    0.6.2
 */