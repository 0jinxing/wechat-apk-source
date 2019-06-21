package com.tencent.mm.plugin.webwx.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ka;
import com.tencent.mm.g.a.ka.a;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.webwx.a.e;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.protocal.protobuf.zp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class ExtDeviceWXLoginUI extends MMActivity
  implements f
{
  private boolean cFv = false;
  private String cLY = null;
  private int fOZ = 0;
  private ProgressDialog nEK = null;
  private int type = 0;
  private boolean uLe = false;
  private String uLo = null;
  private int uLp;
  private int uLq;
  private boolean uLr = false;
  private Button uLs;
  private TextView uLt;

  public void finish()
  {
    AppMethodBeat.i(26532);
    super.finish();
    overridePendingTransition(2131034130, 2131034227);
    AppMethodBeat.o(26532);
  }

  public final int getLayoutId()
  {
    return 2130969285;
  }

  public final void initView()
  {
    AppMethodBeat.i(26530);
    this.cLY = getIntent().getStringExtra("intent.key.login.url");
    this.type = getIntent().getIntExtra("intent.key.type", 0);
    Object localObject1 = getIntent().getStringExtra("intent.key.title.string");
    this.fOZ = getIntent().getIntExtra("intent.key.icon.type", 0);
    String str1 = getIntent().getStringExtra("intent.key.ok.string");
    String str2 = getIntent().getStringExtra("intent.key.cancel.string");
    Object localObject2 = getIntent().getStringExtra("intent.key.content.string");
    this.uLo = getIntent().getStringExtra("intent.key.ok.session.list");
    this.uLp = getIntent().getIntExtra("intent.key.login.client.version", 0);
    this.uLq = getIntent().getIntExtra("intent.key.function.control", 0);
    ab.i("MicroMsg.ExtDeviceWXLoginUI", "type:%s title:%s ok:%s content:%s", new Object[] { Integer.valueOf(this.type), localObject1, str1, localObject2 });
    setMMTitle("");
    if (!bo.isNullOrNil((String)localObject1))
      ((TextView)findViewById(2131823277)).setText((CharSequence)localObject1);
    localObject1 = new ka();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    int i = ((ka)localObject1).cFo.cFp;
    int j = ((ka)localObject1).cFo.cFq;
    int k = ((ka)localObject1).cFo.cFr;
    switch (this.fOZ)
    {
    default:
      aw.ZK();
      c.Ry().set(ac.a.xPA, Integer.valueOf(0));
      if (!bo.isNullOrNil((String)localObject2))
      {
        ((CheckBox)findViewById(2131823278)).setVisibility(8);
        ((TextView)findViewById(2131823279)).setVisibility(0);
        ((TextView)findViewById(2131823279)).setText((CharSequence)localObject2);
        label329: localObject2 = (ImageView)findViewById(2131823276);
        if (this.fOZ == 1)
          break label826;
        if (this.fOZ != 2)
          break label788;
        ((ImageView)localObject2).setImageResource(2131231147);
        label364: this.uLt = ((TextView)findViewById(2131823281));
        this.uLt.setText(str2);
        this.uLt.setOnClickListener(new ExtDeviceWXLoginUI.2(this));
        this.uLs = ((Button)findViewById(2131823280));
        if (bo.isNullOrNil(str1))
          break label893;
        this.uLs.setText(str1);
        if (this.type != 0)
          break label837;
        this.uLs.setEnabled(true);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      this.uLs.setOnClickListener(new ExtDeviceWXLoginUI.3(this));
      this.mController.contentView.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(26524);
          ExtDeviceWXLoginUI.d(ExtDeviceWXLoginUI.this);
          AppMethodBeat.o(26524);
        }
      });
      ((TextView)findViewById(2131823274)).setOnClickListener(new ExtDeviceWXLoginUI.5(this));
      aw.Rg().a(972, this);
      aw.Rg().a(973, this);
      AppMethodBeat.o(26530);
      return;
      aw.ZK();
      c.Ry().set(ac.a.xPA, Integer.valueOf(3));
      break;
      aw.ZK();
      c.Ry().set(ac.a.xPA, Integer.valueOf(4));
      break;
      if (i < 0)
        break label329;
      if ((this.uLq & 0x1) > 0);
      for (boolean bool = true; ; bool = false)
      {
        ab.i("MicroMsg.ExtDeviceWXLoginUI", "msgsynchronize needCheckedSync[%b], iconType[%d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.fOZ) });
        if (((this.fOZ != 1) || (this.uLp < j)) && ((this.fOZ != 2) || (this.uLp < k)))
          break;
        this.uLe = true;
        ((TextView)findViewById(2131823279)).setVisibility(8);
        ((CheckBox)findViewById(2131823278)).setVisibility(0);
        ((CheckBox)findViewById(2131823278)).setText(2131305605);
        if (bool)
        {
          aw.ZK();
          if (((Boolean)c.Ry().get(ac.a.xPz, Boolean.TRUE)).booleanValue());
        }
        else
        {
          ((CheckBox)findViewById(2131823278)).setChecked(false);
        }
        ((ImageView)findViewById(2131823275)).setImageResource(2131231141);
        ((ImageView)findViewById(2131823275)).setOnClickListener(new ExtDeviceWXLoginUI.1(this));
        break;
      }
      label788: if (this.fOZ == 3)
      {
        ((ImageView)localObject2).setImageResource(2131231146);
        break label364;
      }
      if (this.fOZ == 5)
      {
        ((ImageView)localObject2).setImageResource(2131231156);
        break label364;
      }
      label826: ((ImageView)localObject2).setImageResource(2131231152);
      break label364;
      label837: if (this.type == -1)
      {
        this.uLs.setEnabled(false);
        if (this.fOZ == 5)
          this.uLt.setVisibility(8);
      }
      else if (this.type == -2)
      {
        this.uLs.setEnabled(true);
        continue;
        label893: this.uLs.setVisibility(4);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26528);
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    initView();
    overridePendingTransition(2131034229, 2131034130);
    AppMethodBeat.o(26528);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(26533);
    super.onDestroy();
    aw.Rg().b(972, this);
    aw.Rg().b(973, this);
    AppMethodBeat.o(26533);
  }

  public void onPause()
  {
    AppMethodBeat.i(26531);
    super.onPause();
    act localact;
    if ((this.uLr) && (aw.RK()))
    {
      localact = new act();
      localact.wkw = 27;
      if (!r.ku(r.YF()))
        break label87;
    }
    label87: for (int i = 1; ; i = 2)
    {
      localact.pvD = i;
      aw.ZK();
      c.XL().c(new j.a(23, localact));
      this.uLr = false;
      AppMethodBeat.o(26531);
      return;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(26529);
    super.onResume();
    AppMethodBeat.o(26529);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26534);
    if (this.nEK != null)
    {
      this.nEK.dismiss();
      this.nEK = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.ExtDeviceWXLoginUI", "onSceneEnd type[%d], [%d, %d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      aw.Rg().b(972, this);
      if (paramm.getType() == 972)
      {
        paramString = (e)paramm;
        if ((paramString.uLe) || (this.cFv))
        {
          paramString = (zp)paramString.fAT.fsH.fsP;
          if ((paramString != null) && (paramString.weU != null))
            break label205;
          paramString = null;
          paramm = new kb();
          paramm.cFs.cFt = paramString;
          paramm.cFs.cFu = this.fOZ;
          paramm.cFs.cFv = this.cFv;
          com.tencent.mm.sdk.b.a.xxA.m(paramm);
        }
      }
      while (true)
      {
        this.type = 0;
        finish();
        AppMethodBeat.o(26534);
        return;
        label205: paramString = paramString.weU.toByteArray();
        break;
        paramm.getType();
      }
    }
    if (paramInt2 == -1)
    {
      this.type = -1;
      label235: if (!bo.isNullOrNil(paramString))
      {
        ((CheckBox)findViewById(2131823278)).setVisibility(8);
        ((TextView)findViewById(2131823279)).setVisibility(0);
        ((TextView)findViewById(2131823279)).setText(paramString);
      }
      if (this.type != -1)
        break label362;
      if (this.uLs != null)
        this.uLs.setEnabled(false);
    }
    while (true)
    {
      ab.i("MicroMsg.ExtDeviceWXLoginUI", "[oneliang][onSceneEnd]errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(26534);
      break;
      if (paramInt2 != -2)
        break label235;
      this.type = -2;
      break label235;
      label362: if (this.type == -2)
      {
        if (this.uLs != null)
        {
          this.uLs.setEnabled(true);
          this.uLs.setText(2131305609);
        }
        if (this.uLt != null)
          this.uLt.setVisibility(4);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI
 * JD-Core Version:    0.6.2
 */