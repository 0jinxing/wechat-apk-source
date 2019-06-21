package com.tencent.tencentmap.mapsdk.a;

import android.util.Log;
import com.tencent.map.lib.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONException;

public class o
{
  private int a;
  private int b;
  private JSONArray c;
  private String[] d;

  public o(int paramInt1, int paramInt2, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(98253);
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramJSONArray;
    if (this.c == null)
    {
      this.d = null;
      AppMethodBeat.o(98253);
    }
    while (true)
    {
      return;
      paramInt2 = this.c.length();
      this.d = new String[paramInt2];
      paramInt1 = 0;
      label60: if (paramInt1 < paramInt2);
      try
      {
        this.d[paramInt1] = this.c.getString(paramInt1);
        paramInt1++;
        break label60;
        AppMethodBeat.o(98253);
      }
      catch (JSONException paramJSONArray)
      {
        this.d = null;
        d.b(Log.getStackTraceString(paramJSONArray));
        AppMethodBeat.o(98253);
      }
    }
  }

  public int a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public JSONArray c()
  {
    return this.c;
  }

  public String[] d()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.o
 * JD-Core Version:    0.6.2
 */