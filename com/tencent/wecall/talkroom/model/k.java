package com.tencent.wecall.talkroom.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.d;
import java.io.BufferedOutputStream;

public final class k
{
  static BufferedOutputStream mOutputStream = null;
  public static boolean sZe = false;

  public static boolean dTJ()
  {
    AppMethodBeat.i(128006);
    boolean bool;
    if (getNetType(d.sZj) == 4)
    {
      bool = true;
      AppMethodBeat.o(128006);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(128006);
    }
  }

  private static int getNetType(Context paramContext)
  {
    AppMethodBeat.i(128005);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        i = 0;
        AppMethodBeat.o(128005);
      }
      while (true)
      {
        return i;
        i = paramContext.getType();
        if (i == 1)
        {
          i = 4;
          AppMethodBeat.o(128005);
        }
        else
        {
          i = paramContext.getSubtype();
          if (i == 3)
          {
            AppMethodBeat.o(128005);
            i = 3;
          }
          else if (paramContext.getSubtype() > 0)
          {
            i = paramContext.getSubtype();
            if (i < 5)
            {
              AppMethodBeat.o(128005);
              i = 1;
            }
          }
          else if (paramContext.getSubtype() >= 5)
          {
            i = paramContext.getSubtype();
            if (i < 13)
            {
              AppMethodBeat.o(128005);
              i = 3;
            }
          }
          else
          {
            i = paramContext.getSubtype();
            if (i >= 13)
            {
              AppMethodBeat.o(128005);
              i = 5;
            }
            else
            {
              AppMethodBeat.o(128005);
              i = 2;
            }
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(128005);
        int i = 2;
      }
    }
  }

  public static int ju(Context paramContext)
  {
    AppMethodBeat.i(128004);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        i = 0;
        AppMethodBeat.o(128004);
      }
      while (true)
      {
        return i;
        i = paramContext.getType();
        if (i == 1)
        {
          i = 4;
          AppMethodBeat.o(128004);
        }
        else
        {
          i = paramContext.getSubtype();
          if (i == 3)
          {
            AppMethodBeat.o(128004);
            i = 3;
          }
          else if (paramContext.getSubtype() > 0)
          {
            i = paramContext.getSubtype();
            if (i < 5)
            {
              AppMethodBeat.o(128004);
              i = 1;
            }
          }
          else if (paramContext.getSubtype() >= 5)
          {
            i = paramContext.getSubtype();
            if (i < 13)
            {
              AppMethodBeat.o(128004);
              i = 3;
            }
          }
          else
          {
            i = paramContext.getSubtype();
            if (i >= 13)
            {
              AppMethodBeat.o(128004);
              i = 5;
            }
            else
            {
              AppMethodBeat.o(128004);
              i = 2;
            }
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(128004);
        int i = 2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.k
 * JD-Core Version:    0.6.2
 */