package com.tencent.mm.plugin.wear.model.e;

import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.lh;
import com.tencent.mm.g.a.ot;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.List;

public final class e extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26395);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11013));
    localArrayList.add(Integer.valueOf(11014));
    localArrayList.add(Integer.valueOf(11015));
    AppMethodBeat.o(26395);
    return localArrayList;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26396);
    switch (paramInt)
    {
    default:
    case 11013:
    case 11014:
    case 11015:
    }
    while (true)
    {
      AppMethodBeat.o(26396);
      return null;
      paramArrayOfByte = new lh();
      com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte);
      continue;
      paramArrayOfByte = ((j)g.K(j.class)).bOr().bOC();
      if (paramArrayOfByte.size() == 1)
      {
        paramArrayOfByte = ((bi)paramArrayOfByte.get(0)).field_talker;
        Intent localIntent = new Intent();
        localIntent.putExtra("Main_User", paramArrayOfByte);
        localIntent.putExtra("From_fail_notify", true);
        localIntent.addFlags(67108864);
        localIntent.addFlags(536870912);
        if (Build.VERSION.SDK_INT < 16)
          localIntent.putExtra("resend_fail_messages", true);
        ab.d("MicroMsg.Wear.HttpFailMsgServer", "startChattingUI talker=%s", new Object[] { paramArrayOfByte });
        d.f(ah.getContext(), "com.tencent.mm.ui.LauncherUI", localIntent);
      }
      else
      {
        paramArrayOfByte = new Intent();
        paramArrayOfByte.addFlags(67108864);
        paramArrayOfByte.addFlags(536870912);
        if (Build.VERSION.SDK_INT < 16)
          paramArrayOfByte.putExtra("resend_fail_messages", true);
        paramArrayOfByte.putExtra("From_fail_notify", true);
        ab.d("MicroMsg.Wear.HttpFailMsgServer", "startMainUI");
        d.f(ah.getContext(), "com.tencent.mm.ui.LauncherUI", paramArrayOfByte);
        continue;
        paramArrayOfByte = new ot();
        com.tencent.mm.sdk.b.a.xxA.m(paramArrayOfByte);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.e
 * JD-Core Version:    0.6.2
 */