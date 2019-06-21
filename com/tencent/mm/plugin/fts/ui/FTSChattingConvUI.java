package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.i;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import java.util.List;

@i
public class FTSChattingConvUI extends FTSBaseUI
  implements View.OnClickListener
{
  private ad ehM;
  private String mEp;
  private f mIA;
  private View mIz;

  private static void V(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61810);
    paramString = String.format("%s,%d,%d,%d,%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(5), Integer.valueOf(paramInt2), Integer.valueOf(0) });
    ab.v("MicroMsg.FTS.FTSChattingConvUI", "reportClick: %s", new Object[] { paramString });
    h.pYm.X(13234, paramString);
    AppMethodBeat.o(61810);
  }

  private void kT(int paramInt)
  {
    AppMethodBeat.i(61806);
    u localu;
    if (t.mN(this.mEp))
    {
      localu = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().ob(this.mEp);
      if (localu.afg() != null)
        if (paramInt == 0)
        {
          h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(localu.afg().size()), Integer.valueOf(1) });
          AppMethodBeat.o(61806);
        }
    }
    while (true)
    {
      return;
      h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(localu.afg().size()), Integer.valueOf(1) });
      AppMethodBeat.o(61806);
      continue;
      if (paramInt == 0)
      {
        h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(61806);
      }
      else
      {
        h.pYm.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(61806);
      }
    }
  }

  protected final void Nv(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(61807);
    super.Nv(paramString);
    boolean bool = t.mN(this.mEp);
    paramString = h.pYm;
    if (bool);
    while (true)
    {
      paramString.e(14569, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i) });
      AppMethodBeat.o(61807);
      return;
      i = 0;
    }
  }

  protected final d a(e parame)
  {
    AppMethodBeat.i(61800);
    if (this.mIA == null)
      this.mIA = new f(parame, this.mEp);
    parame = this.mIA;
    AppMethodBeat.o(61800);
    return parame;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(61801);
    if (t.mN(this.mEp))
    {
      V(this.query, 10, parama.position + 1);
      AppMethodBeat.o(61801);
    }
    while (true)
    {
      return;
      V(this.query, 11, parama.position + 1);
      AppMethodBeat.o(61801);
    }
  }

  protected final void bAQ()
  {
    AppMethodBeat.i(61799);
    this.mEp = getIntent().getStringExtra("detail_username");
    this.ehM = ((j)g.K(j.class)).XM().aoO(this.mEp);
    ab.i("MicroMsg.FTS.FTSChattingConvUI", "initSearchData conversation=%s", new Object[] { this.mEp });
    AppMethodBeat.o(61799);
  }

  protected final void bAS()
  {
    AppMethodBeat.i(61805);
    super.bAS();
    this.mIz.setVisibility(8);
    AppMethodBeat.o(61805);
  }

  protected final void bAT()
  {
    AppMethodBeat.i(61803);
    super.bAT();
    this.mIz.setVisibility(8);
    AppMethodBeat.o(61803);
  }

  protected final void bAU()
  {
    AppMethodBeat.i(61804);
    super.bAU();
    this.mIz.setVisibility(8);
    AppMethodBeat.o(61804);
  }

  protected final void bAV()
  {
    AppMethodBeat.i(61802);
    super.bAV();
    this.mIz.setVisibility(0);
    AppMethodBeat.o(61802);
  }

  public final int getLayoutId()
  {
    return 2130969618;
  }

  public final void initView()
  {
    AppMethodBeat.i(61798);
    super.initView();
    this.mIz = findViewById(2131824217);
    this.mIz.setVisibility(0);
    RecyclerView localRecyclerView = (RecyclerView)findViewById(2131824218);
    localRecyclerView.setLayoutManager(new GridLayoutManager(3));
    localRecyclerView.a(new RecyclerView.h()
    {
      Paint aFY;
      final int offset;

      public final void a(Canvas paramAnonymousCanvas, RecyclerView paramAnonymousRecyclerView, RecyclerView.s paramAnonymouss)
      {
        AppMethodBeat.i(61792);
        super.a(paramAnonymousCanvas, paramAnonymousRecyclerView, paramAnonymouss);
        this.aFY.setColor(-2434342);
        this.aFY.setStrokeWidth(1.0F);
        this.aFY.setStyle(Paint.Style.FILL);
        int i = paramAnonymousRecyclerView.getChildCount();
        int j = 0;
        if (j < i)
        {
          paramAnonymouss = paramAnonymousRecyclerView.getChildAt(j);
          if ((j == 1) || (j == 4))
          {
            paramAnonymousCanvas.drawLine(paramAnonymouss.getLeft() - this.offset, paramAnonymouss.getTop(), paramAnonymouss.getLeft() - this.offset, paramAnonymouss.getBottom(), this.aFY);
            paramAnonymousCanvas.drawLine(paramAnonymouss.getRight() + this.offset, paramAnonymouss.getTop(), paramAnonymouss.getRight() + this.offset, paramAnonymouss.getBottom(), this.aFY);
          }
          while (true)
          {
            j++;
            break;
            if (j == 7)
              paramAnonymousCanvas.drawLine(paramAnonymouss.getLeft() - this.offset, paramAnonymouss.getTop(), paramAnonymouss.getLeft() - this.offset, paramAnonymouss.getBottom(), this.aFY);
          }
        }
        AppMethodBeat.o(61792);
      }

      public final void a(Rect paramAnonymousRect, View paramAnonymousView, RecyclerView paramAnonymousRecyclerView, RecyclerView.s paramAnonymouss)
      {
        AppMethodBeat.i(61791);
        super.a(paramAnonymousRect, paramAnonymousView, paramAnonymousRecyclerView, paramAnonymouss);
        paramAnonymousRect.set(this.offset, this.offset, this.offset, this.offset);
        AppMethodBeat.o(61791);
      }
    });
    localRecyclerView.setAdapter(new FTSChattingConvUI.a(this));
    AppMethodBeat.o(61798);
  }

  public void onClick(View paramView)
  {
    Intent localIntent1 = null;
    Object localObject1 = null;
    Object localObject2 = null;
    Intent localIntent2 = null;
    AppMethodBeat.i(61809);
    if (!(paramView instanceof TextView))
      AppMethodBeat.o(61809);
    int i;
    while (true)
    {
      return;
      i = ((Integer)paramView.getTag()).intValue();
      if (t.mN(this.mEp));
      while (true)
      {
        if (i != 0)
          break label130;
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSearchMemberDetail");
        paramView = new Intent();
        paramView.putExtra("from_scene", 1);
        paramView.putExtra("RoomInfo_Id", this.mEp);
        paramView.putExtra("title", getResources().getString(2131302802));
        com.tencent.mm.bp.d.f(this, "com.tencent.mm.chatroom.ui.SeeMemberRecordUI", paramView);
        AppMethodBeat.o(61809);
        break;
        i++;
      }
      label130: if (i == 1)
      {
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSearchDateDetail");
        paramView = new Intent();
        paramView.putExtra("detail_username", this.mEp);
        com.tencent.mm.bp.d.f(this, "com.tencent.mm.chatroom.ui.SelectDateUI", paramView);
        kT(0);
        AppMethodBeat.o(61809);
      }
      else
      {
        if (i != 2)
          break;
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeImageVideoHistory");
        paramView = new Intent();
        paramView.putExtra("kintent_talker", this.mEp);
        paramView.putExtra("key_media_type", 1);
        com.tencent.mm.bp.d.f(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI", paramView);
        kT(1);
        AppMethodBeat.o(61809);
      }
    }
    if (i == 3)
    {
      ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeFileHistory");
      localIntent2 = new Intent();
      localIntent2.putExtra("kintent_talker", this.mEp);
      localIntent2.putExtra("key_media_type", 2);
      if (Build.VERSION.SDK_INT < 21)
        break label677;
    }
    label677: for (paramView = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle(); ; paramView = null)
    {
      com.tencent.mm.bp.d.c(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", localIntent2, paramView);
      AppMethodBeat.o(61809);
      break;
      if (i == 4)
      {
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
        localIntent1 = new Intent();
        localIntent1.putExtra("kintent_talker", this.mEp);
        localIntent1.putExtra("key_media_type", 3);
        paramView = localIntent2;
        if (Build.VERSION.SDK_INT >= 21)
          paramView = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
        com.tencent.mm.bp.d.c(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", localIntent1, paramView);
        AppMethodBeat.o(61809);
        break;
      }
      if (i == 5)
      {
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeUrlHistory");
        localIntent2 = new Intent();
        localIntent2.putExtra("kintent_talker", this.mEp);
        localIntent2.putExtra("key_media_type", 4);
        paramView = localIntent1;
        if (Build.VERSION.SDK_INT >= 21)
          paramView = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
        com.tencent.mm.bp.d.c(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", localIntent2, paramView);
        AppMethodBeat.o(61809);
        break;
      }
      if (i == 6)
      {
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSeePayHistory");
        localIntent2 = new Intent();
        localIntent2.putExtra("kintent_talker", this.mEp);
        localIntent2.putExtra("key_media_type", 5);
        paramView = localObject1;
        if (Build.VERSION.SDK_INT >= 21)
          paramView = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
        com.tencent.mm.bp.d.c(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", localIntent2, paramView);
        AppMethodBeat.o(61809);
        break;
      }
      if (i == 7)
      {
        ab.i("MicroMsg.FTS.FTSChattingConvUI", "onSeeAppBrandHistory");
        localIntent2 = new Intent();
        localIntent2.putExtra("kintent_talker", this.mEp);
        localIntent2.putExtra("key_media_type", 6);
        paramView = localObject2;
        if (Build.VERSION.SDK_INT >= 21)
          paramView = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
        com.tencent.mm.bp.d.c(this, "com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI", localIntent2, paramView);
      }
      AppMethodBeat.o(61809);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61797);
    super.onCreate(paramBundle);
    initView();
    paramBundle = ((n)g.M(n.class)).getFTSImageLoader();
    if (paramBundle != null)
      paramBundle.bzY();
    AppMethodBeat.o(61797);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61808);
    super.onDestroy();
    this.mIA.finish();
    com.tencent.mm.plugin.fts.a.d.c localc = ((n)g.M(n.class)).getFTSImageLoader();
    if (localc != null)
      localc.bzW();
    AppMethodBeat.o(61808);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSChattingConvUI
 * JD-Core Version:    0.6.2
 */