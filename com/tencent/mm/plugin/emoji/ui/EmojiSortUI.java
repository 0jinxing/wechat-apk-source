package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Message;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.a.e;
import com.tencent.mm.plugin.emoji.f.s;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.l;
import java.util.ArrayList;
import java.util.Iterator;

public class EmojiSortUI extends EmojiBaseActivity
  implements f, k.a
{
  ProgressDialog gqo;
  private e laq;
  private DragSortListView lar;
  private s las;
  private DragSortListView.h lau;
  private DragSortListView.l lav;
  private ArrayList<EmojiGroupInfo> mData;

  public EmojiSortUI()
  {
    AppMethodBeat.i(53413);
    this.mData = new ArrayList();
    this.lau = new EmojiSortUI.4(this);
    this.lav = new EmojiSortUI.5(this);
    AppMethodBeat.o(53413);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(53417);
    if ((paramString != null) && (paramString.equals("event_update_group")) && (this.laq != null))
    {
      paramString = this.laq;
      paramm = j.getEmojiStorageMgr().xYo.duM();
      paramString.clear();
      paramm = paramm.iterator();
      while (paramm.hasNext())
        paramString.insert((EmojiGroupInfo)paramm.next(), paramString.getCount());
      paramString.notifyDataSetChanged();
    }
    AppMethodBeat.o(53417);
  }

  public final int getLayoutId()
  {
    return 2130969346;
  }

  public final void initView()
  {
    AppMethodBeat.i(53416);
    setBackBtn(new EmojiSortUI.1(this));
    setMMTitle(getString(2131303077));
    addTextOptionMenu(0, getString(2131296944), new EmojiSortUI.2(this));
    ((TextView)findViewById(16908310)).setText(2131299119);
    AppMethodBeat.o(53416);
  }

  public final void l(Message paramMessage)
  {
  }

  public final void m(Message paramMessage)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53414);
    super.onCreate(paramBundle);
    initView();
    this.mData = j.getEmojiStorageMgr().xYo.duM();
    this.lar = ((DragSortListView)findViewById(16908298));
    this.lar.setDropListener(this.lau);
    this.lar.setRemoveListener(this.lav);
    this.laq = new e(this.mController.ylL, this.mData);
    this.lar.setAdapter(this.laq);
    j.getEmojiStorageMgr().xYo.c(this);
    g.RO().eJo.a(717, this);
    AppMethodBeat.o(53414);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53415);
    j.getEmojiStorageMgr().xYo.d(this);
    g.RO().eJo.b(717, this);
    super.onDestroy();
    AppMethodBeat.o(53415);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(53418);
    ab.d("MicroMsg.emoji.EmojiSortUI", "ErrType:" + paramInt1 + "   errCode:" + paramInt2);
    if (this.gqo != null)
      this.gqo.dismiss();
    if ((paramInt1 == 0) && (paramInt1 == 0))
    {
      this.laq.bjz();
      finish();
      AppMethodBeat.o(53418);
    }
    while (true)
    {
      return;
      h.a(this, getString(2131299087), "", new EmojiSortUI.6(this));
      AppMethodBeat.o(53418);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiSortUI
 * JD-Core Version:    0.6.2
 */