package com.tencent.mm.plugin.appbrand.game.d;

import android.content.Context;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d
{
  private static volatile d hrJ;
  public MBRuntime bSv;
  public c hrH;
  public volatile b hrI;
  public final Queue<String> hrK;
  private d.c hrL;
  public Context mContext;
  public volatile int mState;

  private d()
  {
    AppMethodBeat.i(130183);
    this.mState = 0;
    this.hrK = new LinkedList();
    this.hrL = new d.c((byte)0);
    AppMethodBeat.o(130183);
  }

  private void O(int paramInt, String paramString)
  {
    AppMethodBeat.i(130186);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("level", paramInt);
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      localJSONArray.put("wxClient: ".concat(String.valueOf(paramString)));
      localJSONObject.put("logs", localJSONArray);
      Ax(localJSONObject.toString());
      AppMethodBeat.o(130186);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.GameInspector", paramString, "hy: vConsole json error", new Object[0]);
        AppMethodBeat.o(130186);
      }
    }
  }

  public static d aAI()
  {
    AppMethodBeat.i(130181);
    if (hrJ == null);
    try
    {
      if (hrJ == null)
      {
        locald = new com/tencent/mm/plugin/appbrand/game/d/d;
        locald.<init>();
        hrJ = locald;
      }
      d locald = hrJ;
      AppMethodBeat.o(130181);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(130181);
    }
  }

  public static void release()
  {
    AppMethodBeat.i(130182);
    if (hrJ != null);
    while (true)
    {
      try
      {
        if (hrJ != null)
        {
          d locald = hrJ;
          locald.mState = 2;
          locald.hrL.hup.clear();
          locald.bSv = null;
          if (locald.hrI != null)
          {
            locald.hrI.destroy();
            locald.hrI = null;
          }
          if (locald.hrH != null)
          {
            locald.hrH.gyS.stopTimer();
            locald.hrH = null;
          }
          hrJ = null;
        }
        return;
      }
      finally
      {
        AppMethodBeat.o(130182);
      }
      AppMethodBeat.o(130182);
    }
  }

  public final void Ax(String paramString)
  {
    AppMethodBeat.i(130184);
    while (true)
    {
      synchronized (this.hrK)
      {
        if (this.mState != 1)
        {
          this.hrK.add(paramString);
          AppMethodBeat.o(130184);
          return;
        }
        if (this.hrI == null)
          AppMethodBeat.o(130184);
      }
      this.hrI.post(new d.2(this, paramString));
      AppMethodBeat.o(130184);
    }
  }

  public final void b(d.a parama, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(130185);
    if ((parama == null) || (bo.isNullOrNil(paramString)))
    {
      ab.e("MicroMsg.GameInspector", "hy: not valid console!");
      AppMethodBeat.o(130185);
      return;
    }
    int j = i;
    switch (d.3.hrN[parama.ordinal()])
    {
    default:
      j = i;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      O(j, paramString);
      AppMethodBeat.o(130185);
      break;
      j = 1;
      continue;
      j = 2;
      continue;
      j = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.d
 * JD-Core Version:    0.6.2
 */