package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.plugin.record.a.e;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.Map;

public final class c
  implements h.b
{
  public static Map<String, View> pLf;
  private View.OnClickListener mjE;
  private h.a pKt;

  static
  {
    AppMethodBeat.i(24366);
    pLf = new HashMap();
    AppMethodBeat.o(24366);
  }

  public c(h.a parama)
  {
    AppMethodBeat.i(24363);
    this.mjE = new c.1(this);
    this.pKt = parama;
    AppMethodBeat.o(24363);
  }

  public final void a(View paramView, int paramInt, b paramb)
  {
    AppMethodBeat.i(24365);
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.mjE);
    com.tencent.mm.plugin.sight.decode.a.a locala = (com.tencent.mm.plugin.sight.decode.a.a)paramView.findViewById(2131820629);
    ImageView localImageView = (ImageView)paramView.findViewById(2131820981);
    MMPinProgressBtn localMMPinProgressBtn = (MMPinProgressBtn)paramView.findViewById(2131821370);
    locala.setPosition(paramInt);
    com.tencent.mm.plugin.record.ui.a.c localc = (com.tencent.mm.plugin.record.ui.a.c)paramb;
    paramb = this.pKt;
    Map localMap = pLf;
    h.a.c localc1 = new h.a.c();
    localc1.cAv = localc.cAv;
    if (localc.dataType == 0)
    {
      localc1.pKv = localc.cvx;
      if (n.d(localc.cAv, localc.cvx))
      {
        localImageView.setVisibility(8);
        localMMPinProgressBtn.setVisibility(8);
        paramView = n.c(localc.cAv, localc.cvx);
        if (!paramView.equals(locala.getVideoPath()))
          locala.setThumbBmp(paramb.a(localc1));
        locala.bf(paramView, false);
        AppMethodBeat.o(24365);
      }
    }
    while (true)
    {
      return;
      paramView = n.h(localc.cAv.mnd, localc.cvx, true);
      paramView = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(paramView);
      if ((paramView == null) || (2 == paramView.field_status))
        localImageView.setImageResource(2131231923);
      while (true)
      {
        localImageView.setVisibility(0);
        localMMPinProgressBtn.setVisibility(8);
        locala.clear();
        locala.setThumbBmp(paramb.a(localc1));
        AppMethodBeat.o(24365);
        break;
        if ((3 == paramView.field_status) || (4 == paramView.field_status))
        {
          localImageView.setImageResource(2130840197);
        }
        else
        {
          if ((paramView.field_status == 0) || (1 == paramView.field_status))
          {
            localImageView.setVisibility(8);
            localMMPinProgressBtn.setVisibility(0);
            localMMPinProgressBtn.setProgress((int)(paramView.field_offset / Math.max(1, paramView.field_totalLen) * 100.0F));
            locala.clear();
            locala.setThumbBmp(paramb.a(localc1));
            AppMethodBeat.o(24365);
            break;
          }
          localImageView.setImageResource(2131231923);
        }
      }
      if (localc.dataType != 1)
        break label735;
      localMap.put(localc.cAv.mnd, paramView);
      ab.d("MicroMsg.SightRecordData", "dataId %s, status %s", new Object[] { Long.valueOf(localc.mnW.field_localId), Integer.valueOf(localc.mnW.field_itemStatus) });
      localc1.pKv = localc.mnW.field_localId;
      paramView = new gh();
      paramView.cAH.type = 14;
      paramView.cAH.cAJ = localc.cAv;
      com.tencent.mm.sdk.b.a.xxA.m(paramView);
      if ((!localc.mnW.isDone()) && (paramView.cAI.ret != 1))
        break label762;
      if (paramView.cAI.ret != 1)
        break;
      localImageView.setVisibility(8);
      localMMPinProgressBtn.setVisibility(8);
      paramView.cAH.type = 2;
      com.tencent.mm.sdk.b.a.xxA.m(paramView);
      paramView = paramView.cAI.path;
      if (bo.isNullOrNil(paramView))
      {
        ab.w("MicroMsg.SightRecordData", "videoPath is null!");
        AppMethodBeat.o(24365);
      }
      else
      {
        if (!paramView.equals(locala.getVideoPath()))
          locala.setThumbBmp(paramb.a(localc1));
        locala.bf(paramView, false);
        AppMethodBeat.o(24365);
      }
    }
    if (bo.isNullOrNil(localc.cAv.wfZ))
      localImageView.setImageResource(2130840197);
    while (true)
    {
      localImageView.setVisibility(0);
      localMMPinProgressBtn.setVisibility(8);
      locala.clear();
      locala.setThumbBmp(paramb.a(localc1));
      label735: AppMethodBeat.o(24365);
      break;
      ab.w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
      localImageView.setImageResource(2131231923);
      continue;
      label762: if ((localc.mnW.buy()) || (localc.mnW.bux()))
      {
        localImageView.setImageResource(2131231923);
      }
      else
      {
        if (localc.mnW.isDownloading())
        {
          localImageView.setVisibility(8);
          localMMPinProgressBtn.setVisibility(0);
          localMMPinProgressBtn.dKB();
          locala.clear();
          locala.setThumbBmp(paramb.a(localc1));
          AppMethodBeat.o(24365);
          break;
        }
        ab.w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        localImageView.setImageResource(2131231923);
      }
    }
  }

  public final void destroy()
  {
    this.pKt = null;
  }

  public final View eK(Context paramContext)
  {
    AppMethodBeat.i(24364);
    View localView = View.inflate(paramContext, 2130970483, null);
    ((com.tencent.mm.plugin.sight.decode.a.a)localView.findViewById(2131820629)).setDrawableWidth(com.tencent.mm.bz.a.fromDPToPix(paramContext, 260));
    AppMethodBeat.o(24364);
    return localView;
  }

  public final void pause()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.c
 * JD-Core Version:    0.6.2
 */