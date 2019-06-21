package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.k;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;

public class ImageDownloadUI extends MMActivity
  implements com.tencent.mm.ai.f, com.tencent.mm.ai.g
{
  private long cKK = 0L;
  private long cvx = 0L;
  private int fDC;
  private TextView kPu;
  private ProgressBar pyV;
  private TextView pyW;
  private TextView pyX;
  private TextView pyY;
  private com.tencent.mm.at.e pza;
  private k pzb;
  private String username;
  private ImageView yLL;

  private void Bv(int paramInt)
  {
    AppMethodBeat.i(30951);
    this.pyV.setProgress(paramInt);
    this.pyW.setText(getString(2131299966, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.pyV.getMax())
      AppMethodBeat.o(30951);
    while (true)
    {
      return;
      com.tencent.mm.at.e locale = o.ahl().b(Long.valueOf(this.pzb.fEX));
      String str = locale.fDz;
      if (this.fDC == 1)
        str = com.tencent.mm.at.f.c(locale);
      arf(o.ahl().q(str, null, null));
      AppMethodBeat.o(30951);
    }
  }

  private void arf(String paramString)
  {
    AppMethodBeat.i(30952);
    if ((paramString == null) || (paramString.equals("")) || (!com.tencent.mm.vfs.e.ct(paramString)))
    {
      ab.d("ImageDownloadUI", "showImg : imgPath is null");
      AppMethodBeat.o(30952);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent(this, ImageGalleryUI.class);
      localIntent.putExtra("key_message_id", this.cvx);
      localIntent.putExtra("key_image_path", paramString);
      localIntent.putExtra("key_compress_type", this.fDC);
      localIntent.putExtra("key_favorite", true);
      localIntent.putExtra("img_gallery_msg_id", this.cvx);
      localIntent.putExtra("img_gallery_talker", this.username);
      finish();
      AppMethodBeat.o(30952);
    }
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(30950);
    ab.d("ImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paramm.getType() == 109)
      if (paramInt2 == 0)
        break label74;
    label74: for (paramInt1 = paramInt1 * 100 / paramInt2 - 1; ; paramInt1 = 0)
    {
      Bv(Math.max(0, paramInt1));
      AppMethodBeat.o(30950);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130970988;
  }

  public final void initView()
  {
    AppMethodBeat.i(30949);
    this.pyW = ((TextView)findViewById(2131825712));
    this.pyX = ((TextView)findViewById(2131828412));
    this.kPu = ((TextView)findViewById(2131828413));
    this.pyY = ((TextView)findViewById(2131828414));
    this.yLL = ((ImageView)findViewById(2131828410));
    this.yLL.setImageResource(2131231218);
    this.pyW.setVisibility(0);
    this.pyX.setVisibility(8);
    this.kPu.setVisibility(8);
    this.pyY.setVisibility(8);
    setBackBtn(new ImageDownloadUI.1(this));
    this.pyV = ((ProgressBar)findViewById(2131828411));
    AppMethodBeat.o(30949);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30946);
    super.onCreate(paramBundle);
    this.cvx = getIntent().getLongExtra("img_msg_id", 0L);
    this.cKK = getIntent().getLongExtra("img_server_id", 0L);
    this.fDC = getIntent().getIntExtra("img_download_compress_type", 0);
    this.username = getIntent().getStringExtra("img_download_username");
    initView();
    if (this.cvx > 0L)
      this.pza = o.ahl().fJ(this.cvx);
    if (((this.pza == null) || (this.pza.fDy <= 0L)) && (this.cKK > 0L))
      this.pza = o.ahl().fI(this.cKK);
    if ((this.pza == null) || (this.pza.fDy <= 0L))
    {
      ab.e("ImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.cvx + ", or msgSvrId = " + this.cKK);
      AppMethodBeat.o(30946);
    }
    while (true)
    {
      return;
      if ((this.cvx <= 0L) && (this.cKK > 0L))
      {
        aw.ZK();
        this.cvx = c.XO().Q(this.username, this.cKK).field_msgId;
      }
      this.pzb = new k(this.pza.fDy, this.cvx, this.fDC, this);
      aw.Rg().a(this.pzb, 0);
      AppMethodBeat.o(30946);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(30947);
    super.onPause();
    aw.Rg().b(109, this);
    AppMethodBeat.o(30947);
  }

  public void onResume()
  {
    AppMethodBeat.i(30948);
    super.onResume();
    aw.Rg().a(109, this);
    AppMethodBeat.o(30948);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(30953);
    if (paramm.getType() != 109)
      AppMethodBeat.o(30953);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Bv(this.pyV.getMax());
        AppMethodBeat.o(30953);
      }
      else
      {
        ab.e("ImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
        Toast.makeText(this, 2131300609, 1).show();
        AppMethodBeat.o(30953);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ImageDownloadUI
 * JD-Core Version:    0.6.2
 */