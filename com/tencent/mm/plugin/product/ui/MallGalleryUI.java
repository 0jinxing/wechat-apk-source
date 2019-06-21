package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import java.util.List;

@a(3)
public class MallGalleryUI extends MallBaseUI
{
  private final String TAG = "MicroMsg.MallGalleryUI";
  private ViewPager pit;
  private g piu;
  private List<String> piv;
  private int piw = 0;
  private boolean pix;

  final String bZZ()
  {
    Object localObject1 = null;
    AppMethodBeat.i(44043);
    Object localObject2;
    if ((this.piv == null) || (this.piv.size() < this.piw + 1))
    {
      ab.e("MicroMsg.MallGalleryUI", "data not ready.retransmit failed");
      localObject2 = null;
      if (!bo.isNullOrNil((String)localObject2))
        break label84;
      ab.w("MicroMsg.MallGalleryUI", "invoke error. No current url");
      AppMethodBeat.o(44043);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      localObject2 = (String)this.piv.get(this.piw);
      break;
      label84: localObject2 = c.UK((String)localObject2);
      AppMethodBeat.o(44043);
    }
  }

  public final int getLayoutId()
  {
    return 2130970384;
  }

  public final void initView()
  {
    AppMethodBeat.i(44042);
    this.pit = ((ViewPager)findViewById(2131826578));
    this.pit.setOnPageChangeListener(new MallGalleryUI.1(this));
    this.piu = new g(this);
    this.piu.piS = new MallGalleryUI.2(this);
    this.pit.setAdapter(this.piu);
    setBackBtn(new MallGalleryUI.3(this));
    addIconOptionMenu(0, 2130839555, new MallGalleryUI.4(this));
    AppMethodBeat.o(44042);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44040);
    super.onCreate(paramBundle);
    this.piv = getIntent().getStringArrayListExtra("keys_img_urls");
    this.mController.hideTitleView();
    this.pix = false;
    initView();
    AppMethodBeat.o(44040);
  }

  public void onResume()
  {
    AppMethodBeat.i(44041);
    super.onResume();
    this.piu.setData(this.piv);
    this.piu.notifyDataSetChanged();
    if (this.piv != null)
      this.piv.size();
    AppMethodBeat.o(44041);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallGalleryUI
 * JD-Core Version:    0.6.2
 */