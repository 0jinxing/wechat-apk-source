package com.tencent.mm.plugin.account.friend.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.ui.tools.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class InviteFriendUI extends MMActivity
  implements d.a
{
  private ImageView gvq;
  private String gxo;
  private int gxp;
  private String gxq;
  private String gxr;
  private String gxs;
  private Button gxt;
  private int gxu;
  private int gxv;
  private String gxw = null;
  private String gxx = null;

  public final int getLayoutId()
  {
    return 2130969868;
  }

  public final void initView()
  {
    AppMethodBeat.i(108584);
    this.gvq = ((ImageView)findViewById(2131823851));
    TextView localTextView1 = (TextView)findViewById(2131823852);
    TextView localTextView2 = (TextView)findViewById(2131825018);
    TextView localTextView3 = (TextView)findViewById(2131823853);
    this.gxt = ((Button)findViewById(2131823854));
    Button localButton = (Button)findViewById(2131825020);
    localTextView1.setText(this.gxq);
    localTextView3.setText(getString(2131300637, new Object[] { this.gxq }));
    Object localObject;
    if (this.gxp == 1)
    {
      this.gvq.setBackgroundDrawable(com.tencent.mm.bz.a.g(this, 2131231186));
      localTextView2.setText(getString(2131296919) + this.gxo);
      localObject = com.tencent.mm.a.g.x(this.gxo.getBytes());
      if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      {
        localObject = o.acd().bU(ah.getContext());
        if (localObject == null)
          break label590;
        this.gvq.setImageBitmap((Bitmap)localObject);
      }
    }
    else
    {
      label198: if (this.gxp == 0)
      {
        this.gvq.setBackgroundDrawable(com.tencent.mm.bz.a.g(this, 2131231191));
        localTextView2.setText(getString(2131296924) + this.gxo);
        long l = p.cB(this.gxo);
        localObject = null;
        if (l != 0L)
          localObject = com.tencent.mm.ah.b.fr(l);
        if (localObject != null)
          break label606;
        this.gvq.setImageDrawable(com.tencent.mm.bz.a.g(this, 2131231191));
        localButton.setVisibility(0);
      }
      label293: if (this.gxp == 2)
      {
        this.gxt.setText(2131300376);
        this.gvq.setBackgroundDrawable(com.tencent.mm.bz.a.g(this, 2130838446));
        localTextView2.setText(getString(2131296911) + this.gxo);
        if (com.tencent.mm.kernel.g.RP().isSDCardAvailable())
          break label618;
        localObject = o.acd().bU(ah.getContext());
        label379: if (localObject == null)
          break label630;
        this.gvq.setImageBitmap((Bitmap)localObject);
        if (TextUtils.isEmpty(this.gxq))
        {
          localTextView1.setText(bo.anu(this.gxo));
          localTextView3.setText(getString(2131300637, new Object[] { bo.anu(this.gxo) }));
        }
      }
      label393: if (this.gxp == 3)
      {
        this.gxt.setText(2131300636);
        localObject = x.a(new c(this.gxx, this.gxx));
        if (localObject == null)
          break label646;
        this.gvq.setImageBitmap((Bitmap)localObject);
      }
    }
    while (true)
    {
      localButton.setVisibility(8);
      this.gxt.setOnClickListener(new InviteFriendUI.1(this));
      localButton.setOnClickListener(new InviteFriendUI.2(this));
      setBackBtn(new InviteFriendUI.3(this));
      AppMethodBeat.o(108584);
      return;
      localObject = ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vW((String)localObject);
      if (localObject != null)
      {
        localObject = l.b(((com.tencent.mm.plugin.account.friend.a.a)localObject).apz(), this);
        break;
      }
      localObject = null;
      break;
      label590: this.gvq.setImageDrawable(com.tencent.mm.bz.a.g(this, 2131231186));
      break label198;
      label606: this.gvq.setImageBitmap((Bitmap)localObject);
      break label293;
      label618: localObject = com.tencent.mm.ah.b.pP(this.gxr);
      break label379;
      label630: this.gvq.setImageDrawable(com.tencent.mm.bz.a.g(this, 2130838446));
      break label393;
      label646: this.gvq.setImageResource(2131231172);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(108580);
    super.onCreate(paramBundle);
    setMMTitle(2131300639);
    paramBundle = getIntent();
    this.gxp = paramBundle.getIntExtra("friend_type", -1);
    this.gxq = paramBundle.getStringExtra("friend_nick");
    this.gxo = paramBundle.getStringExtra("friend_num");
    this.gxr = paramBundle.getStringExtra("friend_googleID");
    this.gxs = paramBundle.getStringExtra("friend_googleItemID");
    this.gxo = bo.nullAsNil(this.gxo);
    this.gxw = paramBundle.getStringExtra("friend_linkedInID");
    this.gxx = paramBundle.getStringExtra("friend_linkedInPicUrl");
    initView();
    this.gxu = paramBundle.getIntExtra("search_kvstat_scene", 0);
    this.gxv = paramBundle.getIntExtra("search_kvstat_position", 0);
    AppMethodBeat.o(108580);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(108583);
    super.onDestroy();
    AppMethodBeat.o(108583);
  }

  public void onPause()
  {
    AppMethodBeat.i(108581);
    super.onPause();
    o.acd().e(this);
    AppMethodBeat.o(108581);
  }

  public void onResume()
  {
    AppMethodBeat.i(108582);
    super.onResume();
    o.acd().d(this);
    AppMethodBeat.o(108582);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(108585);
    if ((this.gxo == null) || (this.gxo.equals("")))
      AppMethodBeat.o(108585);
    while (true)
    {
      return;
      long l = com.tencent.mm.ah.b.pU(paramString);
      if ((l > 0L) && (this.gxo.equals(String.valueOf(l))) && (this.gxp == 0))
        this.gvq.setImageBitmap(com.tencent.mm.ah.b.a(paramString, false, -1));
      AppMethodBeat.o(108585);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI
 * JD-Core Version:    0.6.2
 */