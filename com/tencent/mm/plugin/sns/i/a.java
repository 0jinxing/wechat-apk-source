package com.tencent.mm.plugin.sns.i;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.MaskTextView;
import com.tencent.mm.plugin.sns.ui.SnsHeader;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public ListView gKd;
  public int mScreenHeight = 0;
  public int mScreenWidth = 0;
  public SnsHeader qQt;
  public boolean qQu = false;

  public final a.a a(au paramau)
  {
    AppMethodBeat.i(36842);
    int i = c.fQr;
    if (i == 2)
    {
      paramau = null;
      AppMethodBeat.o(36842);
    }
    while (true)
    {
      return paramau;
      if ((i == 4) && (!this.qQu))
      {
        paramau = null;
        AppMethodBeat.o(36842);
      }
      else
      {
        long l = System.nanoTime();
        a.a locala = new a.a();
        locala.qQv = System.currentTimeMillis();
        locala.mScreenHeight = this.mScreenHeight;
        locala.mScreenWidth = this.mScreenWidth;
        int j = this.qQt.getTop();
        int k = this.qQt.getHeight();
        i = k;
        if (j < 0)
          i = k + j;
        locala.qQx = i;
        k = this.gKd.getFirstVisiblePosition() - 1;
        int m = this.gKd.getLastVisiblePosition() - 1;
        locala.qQw = k;
        locala.aaF = m;
        int n = paramau.getCount();
        boolean bool = false;
        if (this.gKd.getChildAt(0) != null)
          bool = this.gKd.getChildAt(0) instanceof SnsHeader;
        ab.v("MicroMsg.CaptureSnsHelper", "first last %s %s isHeaderExist %s", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool) });
        if (bool)
        {
          i = 1;
          int i1 = this.gKd.getChildCount();
          label242: if (k > m)
            break label750;
          j = i;
          if (k < n)
          {
            j = i;
            if (k >= 0)
            {
              if (i < i1)
                break label316;
              ab.e("MicroMsg.CaptureSnsHelper", "childPos biger than childCount %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(i1) });
              j = i;
            }
          }
        }
        while (true)
        {
          k++;
          i = j;
          break label242;
          i = 0;
          break;
          label316: if (locala.qQy == null)
            locala.qQy = new LinkedList();
          a.b localb = new a.b();
          locala.qQy.add(localb);
          View localView = this.gKd.getChildAt(i);
          j = i + 1;
          int i2;
          int i3;
          int i4;
          Object localObject;
          if (localView != null)
          {
            i2 = localView.getTop();
            i3 = localView.getLeft();
            i4 = localView.getHeight();
            i = localView.getWidth();
            localObject = paramau.DP(k);
            localb.qQD = i.j((n)localObject);
            localb.qQB = ((n)localObject).field_type;
            localb.qQC = ((n)localObject).DI(32);
            localb.qQz = i2;
            localb.qQA = i3;
            localb.aKv = i4;
            localb.aKu = i;
          }
          if ((localView != null) && (localView.getTag() != null) && ((localView.getTag() instanceof BaseTimeLineItem.BaseViewHolder)))
          {
            localObject = (BaseTimeLineItem.BaseViewHolder)localView.getTag();
            if ((((BaseTimeLineItem.BaseViewHolder)localObject).rHW) && (((BaseTimeLineItem.BaseViewHolder)localObject).rgx != null))
            {
              int i5 = ((BaseTimeLineItem.BaseViewHolder)localObject).rgx.getTop();
              i = ((BaseTimeLineItem.BaseViewHolder)localObject).rgx.getLeft();
              int i6 = ((BaseTimeLineItem.BaseViewHolder)localObject).rHO.getHeight();
              i4 = ((BaseTimeLineItem.BaseViewHolder)localObject).rHO.getWidth();
              i2 = ((BaseTimeLineItem.BaseViewHolder)localObject).rHP.getTop();
              int i7 = ((BaseTimeLineItem.BaseViewHolder)localObject).rHP.getLeft();
              int i8 = ((BaseTimeLineItem.BaseViewHolder)localObject).rHP.getHeight();
              i3 = ((BaseTimeLineItem.BaseViewHolder)localObject).rHP.getWidth();
              ab.v("MicroMsg.CaptureSnsHelper", "holder position %s %s index %s", new Object[] { Integer.valueOf(((BaseTimeLineItem.BaseViewHolder)localObject).position), Integer.valueOf(k), Integer.valueOf(j) });
              if (((BaseTimeLineItem.BaseViewHolder)localObject).qCX.xao != 0)
              {
                localb.qQF = ((BaseTimeLineItem.BaseViewHolder)localObject).qCX.xao;
                localb.qQG = i5;
                localb.qQH = i;
                localb.qQI = i4;
                localb.qQJ = i6;
              }
              if (((BaseTimeLineItem.BaseViewHolder)localObject).qCX.xar != 0)
              {
                localb.qQE = ((BaseTimeLineItem.BaseViewHolder)localObject).qCX.xar;
                localb.qQL = (i7 + i);
                localb.qQK = (i2 + i5);
                localb.qQM = i3;
                localb.qQN = i8;
              }
            }
          }
        }
        label750: ab.i("MicroMsg.CaptureSnsHelper", "end cap: " + (System.nanoTime() - l));
        AppMethodBeat.o(36842);
        paramau = locala;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.a
 * JD-Core Version:    0.6.2
 */