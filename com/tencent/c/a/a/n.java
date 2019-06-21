package com.tencent.c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class n
  implements Runnable
{
  public static long cbG = -1L;
  private a cbE = null;
  int cbF = 0;
  private Context mContext = null;
  private int mType = 0;

  public n(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.mType = paramInt;
  }

  private void d(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(125733);
    if (i.cbu != null)
      if (j.cbA == 1)
      {
        s.zX();
        AppMethodBeat.o(125733);
      }
    while (true)
    {
      return;
      if ((j.cbB > 0) && (this.cbF > j.cbB))
      {
        new StringBuilder("limit dispatch:").append(j.cbB);
        s.zX();
        AppMethodBeat.o(125733);
      }
      else
      {
        paramJSONObject = new m(this.mContext, paramJSONObject).toJSONObject().toString();
        "request data:".concat(String.valueOf(paramJSONObject));
        s.zX();
        i.cbu.cm("[" + paramJSONObject + "]");
        cbG = System.currentTimeMillis();
        this.cbF += 1;
        AppMethodBeat.o(125733);
      }
    }
  }

  private void zU()
  {
    AppMethodBeat.i(125732);
    g localg1 = r.aI(this.mContext).F(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1) })));
    g localg2 = r.aI(this.mContext).F(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(2) })));
    g localg3 = r.aI(this.mContext).F(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(4) })));
    if ((s.b(localg1, localg2)) && (s.b(localg1, localg3)))
    {
      s.zX();
      AppMethodBeat.o(125732);
    }
    while (true)
    {
      return;
      localg1 = s.a(s.a(localg1, localg2), s.a(localg1, localg3));
      new StringBuilder("local mid check failed, redress with mid:").append(localg1.toString());
      s.zX();
      r.aI(this.mContext).b(localg1);
      AppMethodBeat.o(125732);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(125734);
    new StringBuilder("request type:").append(this.mType);
    s.zX();
    switch (this.mType)
    {
    default:
      new StringBuilder("wrong type:").append(this.mType);
      s.zX();
      AppMethodBeat.o(125734);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      d(null);
      AppMethodBeat.o(125734);
      continue;
      if (this.cbE == null)
        this.cbE = r.aI(this.mContext).zW();
      long l1 = System.currentTimeMillis();
      if (i.cbv <= 0L)
        i.cbv = PreferenceManager.getDefaultSharedPreferences(this.mContext).getLong("__MID_LAST_CHECK_TIME__", 0L);
      long l2 = Math.abs(l1 - i.cbv);
      new StringBuilder("check entity: ").append(this.cbE.toString()).append(",duration:").append(l2);
      s.zX();
      if ((this.cbE.caY < 0) || (this.cbE.caY > 100))
        this.cbE.caY = 3;
      long l3 = this.cbE.caY * e.cbp;
      new StringBuilder("duration:").append(l2).append(",maxCheckDays:").append(l3).append(",mLastCheckTime:").append(i.cbv).append(",mCheckEntity:").append(this.cbE);
      s.zX();
      if (l2 < l3)
      {
        if (l2 <= e.cbp)
          break label370;
        zU();
        AppMethodBeat.o(125734);
        continue;
      }
      zU();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("dur", l2);
        localJSONObject.put("md", l3);
        localJSONObject.put("lct", i.cbv);
        localJSONObject.put("cur", l1);
        label356: if (cbG <= 0L)
          d(localJSONObject);
        label370: AppMethodBeat.o(125734);
      }
      catch (JSONException localJSONException)
      {
        break label356;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.n
 * JD-Core Version:    0.6.2
 */