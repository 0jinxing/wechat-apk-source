package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.wear.model.e.p.1;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.protocal.protobuf.cux;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.qqpinyin.voicerecoapi.c;
import java.io.IOException;
import java.util.LinkedList;

public class WearMessageLogic extends BroadcastReceiver
{
  public WearMessageLogic()
  {
    AppMethodBeat.i(26325);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.wear.message");
    ah.getContext().registerReceiver(this, localIntentFilter, "com.tencent.mm.wear.message", null);
    AppMethodBeat.o(26325);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(26326);
    int i;
    if (paramIntent.getAction().equals("com.tencent.mm.wear.message"))
    {
      paramContext = paramIntent.getExtras();
      i = paramContext.getInt("key_connecttype");
      if (i == 1)
      {
        paramIntent = new WearMessageLogic.a(this, (byte)0);
        paramIntent.tXY = i;
        paramIntent.tXZ = paramContext.getInt("key_funid");
        paramIntent.ctE = paramContext.getInt("key_sessionid");
        paramIntent.tYa = paramContext.getByteArray("key_data");
        paramContext = a.cUn().tXr.HL(paramIntent.tXZ);
        if (paramContext != null)
          bool = paramContext.HK(paramIntent.tXZ);
        if (bool)
        {
          al.d(paramIntent);
          AppMethodBeat.o(26326);
        }
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.post(paramIntent, "WearHttpMessageTask_" + paramIntent.tXZ);
      AppMethodBeat.o(26326);
      continue;
      if (i == 2)
      {
        paramIntent = new b((byte)0);
        paramIntent.tXY = i;
        paramIntent.tXZ = paramContext.getInt("key_funid");
        paramIntent.ctE = paramContext.getInt("key_sessionid");
        paramIntent.tYa = paramContext.getByteArray("key_data");
        a.cUn().tXz.a(paramIntent);
        AppMethodBeat.o(26326);
      }
      else
      {
        if (i == 3)
          a.cUn().tXz.a(new WearMessageLogic.c(this, (byte)0));
        AppMethodBeat.o(26326);
      }
    }
  }

  final class b extends com.tencent.mm.plugin.wear.model.f.d
  {
    public int ctE;
    public int tXY;
    public int tXZ;
    public byte[] tYa;

    private b()
    {
    }

    public final void execute()
    {
      AppMethodBeat.i(26323);
      switch (this.tXZ)
      {
      default:
      case 30001:
      }
      while (true)
      {
        AppMethodBeat.o(26323);
        label34: return;
        com.tencent.mm.plugin.wear.model.e.p localp = a.cUn().tXt.tXM;
        int i = this.ctE;
        Object localObject = this.tYa;
        if (localp.hkE.contains(Integer.valueOf(i)))
          continue;
        cux localcux = new cux();
        try
        {
          localcux.parseFrom((byte[])localObject);
          label85: if (localp.tYH == i)
          {
            if (localcux.xqY)
            {
              ab.i("MicroMsg.Wear.VoiceToTextServer", "cancel session %d", new Object[] { Integer.valueOf(i) });
              localp.reset();
              AppMethodBeat.o(26323);
              break label34;
            }
            if (localcux.xqX)
            {
              localp.a(i, localcux);
              if (localp.tYF != null)
              {
                localp.tYF.Fe();
                localp.tYF = null;
                ab.i("MicroMsg.Wear.VoiceToTextServer", "finish speex compress");
              }
              if (localp.tYE != null)
              {
                localp.tYE.stop();
                localp.tYE = null;
                ab.i("MicroMsg.Wear.VoiceToTextServer", "finish voiceDetectAPI");
              }
              if (localp.tYD != null)
              {
                localp.tYD.fZa = true;
                if (!localp.cRY)
                  aw.Rg().a(localp.tYD, 0);
                localp.tYD = null;
                ab.i("MicroMsg.Wear.VoiceToTextServer", "finish netSceneVoiceToText");
              }
              AppMethodBeat.o(26323);
              break label34;
            }
            localp.a(i, localcux);
            AppMethodBeat.o(26323);
            break label34;
          }
          localp.reset();
          localp.tYH = i;
          ab.i("MicroMsg.Wear.VoiceToTextServer", "startNewSession %s", new Object[] { Integer.valueOf(localp.tYH) });
          e.deleteFile(com.tencent.mm.plugin.wear.model.e.p.tYC);
          if (localp.tYF == null)
          {
            localp.tYF = new com.tencent.mm.audio.d.d();
            localp.tYF.eo(com.tencent.mm.plugin.wear.model.e.p.tYC);
          }
          if (localp.tYE == null)
          {
            localp.tYE = new c(1500000);
            if (localp.tYE.dPU() != 0)
            {
              localp.tYI = -2;
              AppMethodBeat.o(26323);
              break label34;
            }
          }
          localObject = localcux.wyw;
          if (localp.tYD == null)
            al.d(new p.1(localp, (String)localObject));
          localp.a(i, localcux);
        }
        catch (IOException localIOException)
        {
          break label85;
        }
      }
    }

    public final String getName()
    {
      return "LongConnectTask";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.WearMessageLogic
 * JD-Core Version:    0.6.2
 */