package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.h.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SnsUploadBrowseUI extends SnsBaseGalleryUI
  implements s.a
{
  private ArrayList<String> rCg;
  private HashMap<Integer, Boolean> rCh;
  private int rpr;

  public SnsUploadBrowseUI()
  {
    AppMethodBeat.i(39680);
    this.rCg = new ArrayList();
    this.rpr = 0;
    this.rCh = new HashMap();
    AppMethodBeat.o(39680);
  }

  public final void cuw()
  {
    AppMethodBeat.i(39685);
    Intent localIntent = new Intent();
    Object localObject = this.rpp.getFlipList();
    if (localObject == null)
    {
      AppMethodBeat.o(39685);
      return;
    }
    this.rCg.clear();
    Iterator localIterator = ((List)localObject).iterator();
    label45: if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localObject = af.getAccSnsTmpPath() + localb.cNr.Id;
      if (!localb.cNr.Id.startsWith("pre_temp_extend_pic"))
        break label185;
      localObject = localb.cNr.Id.substring(19);
    }
    label185: 
    while (true)
    {
      this.rCg.add(localObject);
      break label45;
      localIntent.putExtra("sns_gallery_temp_paths", this.rCg);
      localIntent.putExtra("sns_update_preview_image_count", this.rCh.size());
      this.rCh.clear();
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(39685);
      break;
    }
  }

  public final void dg(String paramString, int paramInt)
  {
    AppMethodBeat.i(39688);
    if (this.rpp != null)
      this.rpp.btt();
    AppMethodBeat.o(39688);
  }

  public final void dh(String paramString, int paramInt)
  {
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39686);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsUploadBrowseUI", "dispatchKeyEvent");
      cuw();
      bool = true;
      AppMethodBeat.o(39686);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39686);
    }
  }

  public final int getForceOrientation()
  {
    return 4;
  }

  public final int getLayoutId()
  {
    return 2130970748;
  }

  public final void initView()
  {
    AppMethodBeat.i(39687);
    String str = bo.bc(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.rCg = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
    if (this.rCg == null)
      AppMethodBeat.o(39687);
    while (true)
    {
      return;
      this.rpr = getIntent().getIntExtra("sns_gallery_position", 0);
      this.rpp = new SnsInfoFlip(this);
      this.rpp.setEnableHorLongBmpMode(false);
      this.rpp.setShowTitle(true);
      af.getAccSnsTmpPath();
      List localList = aj.df(this.rCg);
      this.rpp.a(localList, str, this.rpr, this.rpk, this);
      this.rpp.setOnPageSelectListener(new SnsUploadBrowseUI.1(this));
      addView(this.rpp);
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(39677);
          SnsUploadBrowseUI.this.cuw();
          AppMethodBeat.o(39677);
          return true;
        }
      });
      addIconOptionMenu(0, 2131296881, 2130839554, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(39679);
          h.a(SnsUploadBrowseUI.this, 2131303645, 2131297061, new SnsUploadBrowseUI.3.1(this), new SnsUploadBrowseUI.3.2(this));
          AppMethodBeat.o(39679);
          return true;
        }
      });
      AppMethodBeat.o(39687);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39689);
    ab.i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(39689);
    while (true)
    {
      return;
      AppMethodBeat.o(39689);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39681);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(39681);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39682);
    if (this.rpp != null)
    {
      this.rpp.ctm();
      this.rpp.onDestroy();
    }
    af.cnC().ab(this);
    super.onDestroy();
    AppMethodBeat.o(39682);
  }

  public void onPause()
  {
    AppMethodBeat.i(39684);
    if (this.rpp != null)
      this.rpp.onPause();
    super.onPause();
    AppMethodBeat.o(39684);
  }

  public void onResume()
  {
    AppMethodBeat.i(39683);
    super.onResume();
    if (this.rpp != null)
      this.rpp.btt();
    AppMethodBeat.o(39683);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI
 * JD-Core Version:    0.6.2
 */