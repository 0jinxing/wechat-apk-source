package com.tencent.mm.plugin.multitalk.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkVideoView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class m
{
  public volatile Map<String, m.a> oHq;

  public m()
  {
    AppMethodBeat.i(54073);
    this.oHq = Collections.synchronizedMap(new HashMap());
    AppMethodBeat.o(54073);
  }

  public final boolean a(MultiTalkVideoView paramMultiTalkVideoView, boolean paramBoolean)
  {
    AppMethodBeat.i(54075);
    m.a locala;
    Bitmap localBitmap1;
    Bitmap localBitmap2;
    if (this.oHq.containsKey(paramMultiTalkVideoView.getUsername()))
    {
      locala = (m.a)this.oHq.get(paramMultiTalkVideoView.getUsername());
      if (locala.gFP == null)
        break label183;
      if (paramBoolean)
      {
        localBitmap1 = a.b.diS().b(paramMultiTalkVideoView.getUsername(), paramMultiTalkVideoView.getMeasuredWidth(), paramMultiTalkVideoView.getMeasuredHeight(), 1);
        localBitmap2 = localBitmap1;
        if (localBitmap1 != null)
        {
          localBitmap2 = localBitmap1;
          if (localBitmap1.getHeight() < localBitmap1.getWidth())
            localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, localBitmap1.getHeight(), localBitmap1.getHeight());
        }
        locala.gFP = localBitmap2;
      }
      label123: if (locala.gFP == null)
        break label260;
      paramMultiTalkVideoView.d(locala.gFP, 0, 0);
      AppMethodBeat.o(54075);
    }
    while (true)
    {
      return true;
      locala = new m.a(this, (byte)0);
      locala.username = paramMultiTalkVideoView.getUsername();
      this.oHq.put(paramMultiTalkVideoView.getUsername(), locala);
      break;
      label183: localBitmap1 = a.b.diS().b(paramMultiTalkVideoView.getUsername(), paramMultiTalkVideoView.getMeasuredWidth(), paramMultiTalkVideoView.getMeasuredHeight(), 1);
      localBitmap2 = localBitmap1;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (localBitmap1.getHeight() < localBitmap1.getWidth())
          localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, localBitmap1.getHeight(), localBitmap1.getHeight());
      }
      locala.gFP = localBitmap2;
      break label123;
      label260: if (locala.oHr == null)
        locala.oHr = BitmapFactory.decodeResource(paramMultiTalkVideoView.getResources(), 2130839624);
      paramMultiTalkVideoView.d(locala.oHr, 0, 0);
      AppMethodBeat.o(54075);
    }
  }

  public final boolean a(MultiTalkVideoView paramMultiTalkVideoView, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(54074);
        if (paramArrayOfInt == null)
        {
          ab.e("MicroMsg.MT.MultiTalkViewManager", "renderVideoBitmap img is null");
          AppMethodBeat.o(54074);
          return bool;
        }
        if (paramArrayOfInt.length < paramInt1 * paramInt2)
        {
          ab.e("MicroMsg.MT.MultiTalkViewManager", "img length error %d %d", new Object[] { Integer.valueOf(paramArrayOfInt.length), Integer.valueOf(paramInt1 * paramInt2) });
          AppMethodBeat.o(54074);
          continue;
        }
      }
      finally
      {
      }
      if (paramInt1 == paramInt2)
        break;
      ab.e("MicroMsg.MT.MultiTalkViewManager", "imgW != imgH");
      AppMethodBeat.o(54074);
    }
    m.a locala = (m.a)this.oHq.get(paramMultiTalkVideoView.getUsername());
    if (locala == null)
    {
      locala = new com/tencent/mm/plugin/multitalk/model/m$a;
      locala.<init>(this, (byte)0);
      this.oHq.put(paramMultiTalkVideoView.getUsername(), locala);
    }
    while (true)
    {
      locala.oHb = 0;
      locala.angle = paramInt3;
      if ((locala.oHs == null) || (locala.oHs.getWidth() != paramInt2))
        locala.oHs = Bitmap.createBitmap(paramInt2, paramInt2, Bitmap.Config.ARGB_8888);
      locala.oHs.setPixels(paramArrayOfInt, 0, paramInt2, 0, 0, paramInt2, paramInt2);
      paramMultiTalkVideoView.d(locala.oHs, locala.angle, locala.oHb);
      AppMethodBeat.o(54074);
      bool = true;
      break;
    }
  }

  public final void bRZ()
  {
    AppMethodBeat.i(54076);
    this.oHq.clear();
    AppMethodBeat.o(54076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.m
 * JD-Core Version:    0.6.2
 */