package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.a.c;
import com.tencent.mm.plugin.emoji.model.f;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.GetEmotionListResponse;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class EmojiMineUI extends BaseEmojiStoreUI
  implements View.OnClickListener
{
  private final String TAG = "MicroMsg.emoji.EmojiMineUI";
  private View kZu;
  private TextView kZv;
  private ViewGroup laf;
  private ViewGroup lag;
  private ViewGroup lah;
  private ViewGroup lai;
  private ViewGroup laj;
  private TextView lak;

  private boolean ug(int paramInt)
  {
    AppMethodBeat.i(53378);
    Intent localIntent = new Intent();
    localIntent.setClass(this, EmojiCustomUI.class);
    localIntent.putExtra("key_emoji_panel_type", paramInt);
    startActivity(localIntent);
    AppMethodBeat.o(53378);
    return true;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(53382);
    if ((paramString != null) && (paramString.equals("event_update_group")))
    {
      blo();
      dS(131074, 50);
    }
    AppMethodBeat.o(53382);
  }

  protected final void a(boolean paramBoolean1, f paramf, boolean paramBoolean2, boolean paramBoolean3)
  {
  }

  protected final int aH(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53380);
    int i = super.aH(paramArrayOfByte);
    AppMethodBeat.o(53380);
    return i;
  }

  protected final int bkM()
  {
    return 24;
  }

  protected final int bkN()
  {
    return 7;
  }

  protected final com.tencent.mm.plugin.emoji.a.a.a bkO()
  {
    AppMethodBeat.i(53379);
    c localc = new c(this.mController.ylL);
    AppMethodBeat.o(53379);
    return localc;
  }

  protected final void bkP()
  {
    AppMethodBeat.i(53383);
    this.laj = ((ViewGroup)View.inflate(this.mController.ylL, 2130969341, null));
    this.lak = ((TextView)this.laj.findViewById(2131823492));
    this.lak.setText(2131303080);
    this.lak.setVisibility(8);
    this.mListView.addHeaderView(this.laj, null, false);
    this.laf = ((ViewGroup)View.inflate(this.mController.ylL, 2130969338, null));
    this.lag = ((ViewGroup)this.laj.findViewById(2131823488));
    this.lah = ((ViewGroup)this.laj.findViewById(2131823489));
    this.lai = ((ViewGroup)this.laf.findViewById(2131823487));
    ((TextView)this.lag.findViewById(16908310)).setText(2131299041);
    ((TextView)this.lai.findViewById(16908310)).setText(2131299070);
    ((TextView)this.lah.findViewById(2131823491)).setText(2131299033);
    this.lai.findViewById(2131821019).setBackgroundResource(2130838398);
    this.lag.setOnClickListener(this);
    this.lai.setOnClickListener(this);
    this.lah.setOnClickListener(this);
    this.mListView.addFooterView(this.laf, null, false);
    AppMethodBeat.o(53383);
  }

  protected final boolean bkR()
  {
    return false;
  }

  protected final boolean bkS()
  {
    return false;
  }

  protected final int bkV()
  {
    return 8;
  }

  protected final boolean bla()
  {
    boolean bool = true;
    AppMethodBeat.i(53384);
    if (this.kVA != null)
    {
      this.kVA.notifyDataSetChanged();
      this.kYv = true;
      this.Ek.setVisibility(8);
    }
    while (true)
    {
      ble();
      AppMethodBeat.o(53384);
      return bool;
      bool = false;
    }
  }

  protected final boolean blc()
  {
    return true;
  }

  protected final boolean bld()
  {
    return false;
  }

  public final void ble()
  {
    AppMethodBeat.i(53387);
    if (this.laj != null)
      if ((this.kVA != null) && (!this.kVA.isEmpty()))
      {
        this.lak.setVisibility(0);
        AppMethodBeat.o(53387);
      }
    while (true)
    {
      return;
      this.lak.setVisibility(8);
      AppMethodBeat.o(53387);
    }
  }

  protected final void c(GetEmotionListResponse paramGetEmotionListResponse)
  {
    AppMethodBeat.i(53385);
    super.c(paramGetEmotionListResponse);
    AppMethodBeat.o(53385);
  }

  public final int getLayoutId()
  {
    return 2130969356;
  }

  public final void h(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
  }

  public final void initView()
  {
    AppMethodBeat.i(53376);
    setMMTitle(2131303078);
    super.initView();
    this.kZu = findViewById(2131823451);
    this.kZv = ((TextView)this.kZu.findViewById(2131823452));
    this.kZv.setText(2131299185);
    if (j.bkj().kXj.kXr)
    {
      j.bkj();
      if (BKGLoaderManager.bkJ())
      {
        this.kZu.setVisibility(0);
        dS(8001, 3000);
      }
    }
    while (true)
    {
      this.mListView.setOnScrollListener(null);
      AppMethodBeat.o(53376);
      return;
      this.kZu.setVisibility(8);
    }
  }

  public final void m(Message paramMessage)
  {
    AppMethodBeat.i(53386);
    if ((paramMessage.what == 8001) && (this.kZu != null))
      this.kZu.setVisibility(8);
    super.m(paramMessage);
    AppMethodBeat.o(53386);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(53377);
    if (paramView == this.lag)
    {
      ug(0);
      AppMethodBeat.o(53377);
    }
    while (true)
    {
      return;
      if (paramView == this.lai)
      {
        paramView = new Intent();
        paramView.setClass(this, EmojiPaidUI.class);
        startActivity(paramView);
        AppMethodBeat.o(53377);
      }
      else if (paramView == this.lah)
      {
        ug(1);
        AppMethodBeat.o(53377);
      }
      else
      {
        AppMethodBeat.o(53377);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53375);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("10931", 0);
    h.pYm.X(10931, String.valueOf(i));
    ab.i("MicroMsg.emoji.EmojiMineUI", "jacks statistics enter Emoji Setting UI:%d", new Object[] { Integer.valueOf(i) });
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(53373);
        EmojiMineUI.this.finish();
        AppMethodBeat.o(53373);
        return true;
      }
    });
    addTextOptionMenu(0, getString(2131299083), new EmojiMineUI.2(this));
    if (!((Boolean)g.RP().Ry().get(ac.a.xJg, Boolean.FALSE)).booleanValue())
      com.tencent.mm.plugin.emoji.c.a.gm(true);
    h.pYm.a(406L, 3L, 1L, false);
    h.pYm.a(406L, 5L, System.currentTimeMillis() - l, false);
    h.pYm.e(12740, new Object[] { Integer.valueOf(4), "", "", "", Integer.valueOf(24), Integer.valueOf(24) });
    AppMethodBeat.o(53375);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(53381);
    super.onItemClick(paramAdapterView, paramView, paramInt - 1, paramLong);
    AppMethodBeat.o(53381);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiMineUI
 * JD-Core Version:    0.6.2
 */