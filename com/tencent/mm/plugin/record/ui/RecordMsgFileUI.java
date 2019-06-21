package com.tencent.mm.plugin.record.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.b.l;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RecordMsgFileUI extends MMActivity
  implements com.tencent.mm.plugin.record.a.d
{
  private aar cAv;
  private String cHr;
  private long cvx;
  private ak fbD;
  private TextView gxi;
  private TextView iqU;
  private com.tencent.mm.pluginsdk.ui.tools.e klq = null;
  private Button mlD;
  private Button mlE;
  private Button mlF;
  private MMImageView mlG;
  private TextView mlH;
  private View mlI;
  private View mlJ;
  private boolean mlN = false;
  private boolean mlR = false;
  private boolean mlS = false;
  private l pKH;
  private ProgressBar progressBar;

  private void bnS()
  {
    AppMethodBeat.i(24284);
    if (this.mlR)
      AppMethodBeat.o(24284);
    while (true)
    {
      return;
      this.mlR = true;
      Intent localIntent = new Intent();
      localIntent.putExtra("key_detail_fav_path", n.c(this.cAv, this.cvx));
      localIntent.putExtra("key_detail_fav_thumb_path", n.f(this.cAv, this.cvx));
      localIntent.putExtra("key_detail_fav_video_duration", this.cAv.duration);
      localIntent.putExtra("key_detail_statExtStr", this.cAv.cMn);
      localIntent.putExtra("key_detail_fav_video_scene_from", 1);
      b.b(this, ".ui.detail.FavoriteVideoPlayUI", localIntent);
      finish();
      AppMethodBeat.o(24284);
    }
  }

  private void bwh()
  {
    AppMethodBeat.i(24273);
    this.mlF.setVisibility(8);
    this.mlD.setVisibility(8);
    this.mlE.setVisibility(8);
    this.mlI.setVisibility(8);
    this.iqU.setVisibility(0);
    if (this.cAv.dataType == 4)
    {
      this.iqU.setGravity(17);
      this.iqU.setText(2131299678);
      AppMethodBeat.o(24273);
    }
    while (true)
    {
      return;
      this.iqU.setGravity(17);
      this.iqU.setText(2131299677);
      AppMethodBeat.o(24273);
    }
  }

  private void bwi()
  {
    AppMethodBeat.i(24274);
    this.mlF.setVisibility(8);
    this.mlD.setVisibility(8);
    this.mlE.setVisibility(8);
    this.iqU.setVisibility(8);
    this.mlI.setVisibility(0);
    c(((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(this.cHr));
    AppMethodBeat.o(24274);
  }

  private void bwj()
  {
    AppMethodBeat.i(24275);
    this.mlI.setVisibility(8);
    this.mlE.setVisibility(8);
    if (bo.isNullOrNil(this.cAv.wgg))
      this.mlD.setVisibility(8);
    while (true)
    {
      this.mlF.setVisibility(0);
      this.mlF.setText(2131299655);
      this.iqU.setVisibility(8);
      AppMethodBeat.o(24275);
      return;
      this.mlD.setVisibility(0);
    }
  }

  private void bwl()
  {
    AppMethodBeat.i(24276);
    if ((getType() == 15) && (this.cAv.wgZ != null) && (!bo.isNullOrNil(this.cAv.wgZ.fiG)) && (!bo.isNullOrNil(this.cAv.wgZ.fiK)))
    {
      this.mlS = true;
      this.mlG.setVisibility(8);
      this.mlI.setVisibility(8);
      this.mlF.setVisibility(8);
      this.mlD.setVisibility(8);
      this.mlE.setVisibility(8);
      this.iqU.setVisibility(8);
      String str = n.c(this.cAv, this.cvx);
      ab.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.Mp() + " initView: fullpath:" + str);
      ViewGroup localViewGroup = (ViewGroup)findViewById(2131823992);
      this.klq = com.tencent.mm.pluginsdk.ui.tools.q.fT(this.mController.ylL);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(13);
      localViewGroup.addView((View)this.klq, 0, localLayoutParams);
      this.klq.setVideoCallback(new RecordMsgFileUI.12(this));
      ab.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.Mp() + " initView :" + str);
      if (str != null)
      {
        this.klq.stop();
        this.klq.setVideoPath(str);
      }
      ab.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.Mp() + " initView");
      if (aw.Cc() != null)
        aw.Cc().Id();
    }
    if ((getType() == 15) || (getType() == 4))
    {
      if (!this.mlS)
      {
        this.mlI.setVisibility(8);
        this.mlF.setVisibility(8);
        this.mlD.setVisibility(8);
        this.mlE.setVisibility(0);
        this.mlE.setText(2131299657);
        this.iqU.setVisibility(8);
        bnS();
        AppMethodBeat.o(24276);
      }
    }
    else
    {
      this.mlI.setVisibility(8);
      this.mlF.setVisibility(4);
      if (!bo.isNullOrNil(this.cAv.wgg))
        break label477;
      this.mlD.setVisibility(8);
    }
    while (true)
    {
      this.mlE.setVisibility(0);
      this.iqU.setVisibility(0);
      AppMethodBeat.o(24276);
      break;
      label477: this.mlD.setVisibility(0);
    }
  }

  private void c(i parami)
  {
    AppMethodBeat.i(24282);
    int i;
    int j;
    int k;
    if (parami != null)
    {
      i = (int)(parami.field_offset / Math.max(1, parami.field_totalLen) * 100.0F);
      j = parami.field_offset;
      k = parami.field_totalLen;
    }
    while (true)
    {
      this.fbD.post(new RecordMsgFileUI.3(this, i, j, k));
      AppMethodBeat.o(24282);
      return;
      k = (int)this.cAv.wgu;
      j = 0;
      i = 0;
    }
  }

  private String ceR()
  {
    AppMethodBeat.i(24281);
    Object localObject = new File(n.f(this.cAv, this.cvx));
    if (((File)localObject).exists());
    for (localObject = ((File)localObject).getAbsolutePath(); ; localObject = com.tencent.mm.model.c.Yg() + "web/" + com.tencent.mm.a.g.x(bo.bc(this.cAv.cvq, "").getBytes()))
    {
      AppMethodBeat.o(24281);
      return localObject;
      localObject = new StringBuilder();
      aw.ZK();
    }
  }

  private int getType()
  {
    int i = this.cAv.dataType;
    int j = i;
    if (i == 15)
      j = 4;
    return j;
  }

  public final void a(int paramInt, i parami)
  {
    AppMethodBeat.i(24283);
    if (parami == null)
    {
      ab.w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
      AppMethodBeat.o(24283);
    }
    while (true)
    {
      return;
      ab.v("MicroMsg.RecordMsgFileUI", "cur mediaid[%s], notify mediaid[%s]", new Object[] { this.cHr, parami.field_mediaId });
      if (!this.cHr.equals(parami.field_mediaId))
        AppMethodBeat.o(24283);
      else
        switch (parami.field_status)
        {
        default:
          c(parami);
          AppMethodBeat.o(24283);
          break;
        case 2:
          this.fbD.post(new RecordMsgFileUI.4(this));
          AppMethodBeat.o(24283);
          break;
        case 4:
          this.fbD.post(new RecordMsgFileUI.5(this));
          AppMethodBeat.o(24283);
          break;
        case 3:
          this.fbD.post(new RecordMsgFileUI.6(this));
          AppMethodBeat.o(24283);
        }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969546;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(24280);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, 2131298926, 2131298927, 5);
    if (paramInt2 != -1)
      AppMethodBeat.o(24280);
    while (true)
    {
      return;
      if (paramInt1 == 1001)
      {
        if (paramIntent == null)
        {
          localObject1 = null;
          label54: if (paramIntent != null)
            break label144;
        }
        Object localObject2;
        label144: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
        {
          localObject2 = h.b(this.mController.ylL, getString(2131299643), false, null);
          ab.d("MicroMsg.RecordMsgFileUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
          localObject2 = new RecordMsgFileUI.13(this, (Dialog)localObject2);
          if (!bo.isNullOrNil((String)localObject1))
            break label155;
          AppMethodBeat.o(24280);
          break;
          localObject1 = paramIntent.getStringExtra("Select_Conv_User");
          break label54;
        }
        label155: Object localObject1 = bo.P(((String)localObject1).split(","));
        if ((getType() == 4) || (getType() == 15))
        {
          aw.RS().aa(new RecordMsgFileUI.14(this, (List)localObject1, paramIntent, (Runnable)localObject2));
          AppMethodBeat.o(24280);
        }
        else
        {
          aw.RS().aa(new RecordMsgFileUI.2(this, (List)localObject1, paramIntent, (Runnable)localObject2));
        }
      }
      else
      {
        AppMethodBeat.o(24280);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24272);
    super.onCreate(paramBundle);
    this.fbD = new ak();
    this.pKH = new l();
    this.cvx = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = n.VI(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      ab.w("MicroMsg.RecordMsgFileUI", "get record msg data error, empty");
      finish();
      AppMethodBeat.o(24272);
    }
    while (true)
    {
      return;
      localObject = ((com.tencent.mm.protocal.b.a.c)localObject).fjr.iterator();
      while (((Iterator)localObject).hasNext())
      {
        aar localaar = (aar)((Iterator)localObject).next();
        if (localaar.mnd.equals(paramBundle))
          this.cAv = localaar;
      }
      if (this.cAv != null)
        break;
      ab.w("MicroMsg.RecordMsgFileUI", "get data error, empty");
      finish();
      AppMethodBeat.o(24272);
    }
    this.cHr = n.h(this.cAv.mnd, this.cvx, true);
    this.mlD = ((Button)findViewById(2131823997));
    this.mlE = ((Button)findViewById(2131823998));
    this.mlF = ((Button)findViewById(2131822658));
    this.mlG = ((MMImageView)findViewById(2131821226));
    this.gxi = ((TextView)findViewById(2131821227));
    this.iqU = ((TextView)findViewById(2131823800));
    this.mlJ = findViewById(2131821526);
    this.mlI = findViewById(2131821524);
    this.progressBar = ((ProgressBar)findViewById(2131821525));
    this.mlH = ((TextView)findViewById(2131823996));
    label340: label358: label493: int i;
    label522: int j;
    if (4 == getType())
    {
      setMMTitle(2131299761);
      if (getType() != 4)
        break label634;
      this.mlG.setImageResource(2131230817);
      this.gxi.setText(this.cAv.title);
      setBackBtn(new RecordMsgFileUI.1(this));
      this.mlE.setOnClickListener(new RecordMsgFileUI.7(this));
      paramBundle = this.cAv.wgg;
      if (!bo.isNullOrNil(paramBundle))
        this.mlD.setOnClickListener(new RecordMsgFileUI.8(this, paramBundle));
      this.mlF.setOnClickListener(new RecordMsgFileUI.9(this));
      this.mlJ.setOnClickListener(new RecordMsgFileUI.10(this));
      if ((getType() != 15) || (bo.ank(com.tencent.mm.m.g.Nu().getValue("SightForwardEnable")) == 1))
        break label654;
      ab.w("MicroMsg.RecordMsgFileUI", "can not retransmit sight msg");
      if ((!bo.isNullOrNil(this.cAv.wfZ)) && (!bo.isNullOrNil(this.cAv.wgb)))
        break label673;
      i = 1;
      if ((!bo.isNullOrNil(this.cAv.whr)) && (!bo.isNullOrNil(this.cAv.who)))
        break label679;
      j = 1;
      label551: if ((i != 0) || (j != 0))
        break label685;
      bwh();
    }
    while (true)
    {
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a(this);
      AppMethodBeat.o(24272);
      break;
      if (15 == getType())
      {
        setMMTitle(2131299735);
        findViewById(2131823992).setBackgroundResource(2131689761);
        break label340;
      }
      setMMTitle(2131299641);
      break label340;
      label634: this.mlG.setImageResource(com.tencent.mm.pluginsdk.d.ail(this.cAv.wgo));
      break label358;
      label654: addIconOptionMenu(0, 2130839555, new RecordMsgFileUI.11(this));
      break label493;
      label673: i = 0;
      break label522;
      label679: j = 0;
      break label551;
      label685: if (!n.d(this.cAv, this.cvx))
        break label711;
      enableOptionMenu(true);
      bwl();
    }
    label711: paramBundle = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(this.cHr);
    if ((paramBundle == null) || (2 == paramBundle.field_status))
      bwj();
    while (true)
    {
      enableOptionMenu(false);
      break;
      if (4 == paramBundle.field_status)
      {
        bwh();
      }
      else if ((paramBundle.field_status == 0) || (1 == paramBundle.field_status))
      {
        bwi();
      }
      else
      {
        ab.w("MicroMsg.RecordMsgFileUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        bwj();
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24277);
    if (this.klq != null)
    {
      this.klq.setVideoCallback(null);
      this.klq.stop();
      this.klq.onDetach();
      if (aw.Cc() != null)
        aw.Cc().Ic();
    }
    super.onDestroy();
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(this);
    this.pKH.destory();
    AppMethodBeat.o(24277);
  }

  public void onPause()
  {
    AppMethodBeat.i(24279);
    super.onPause();
    if (this.klq != null)
      this.klq.stop();
    AppMethodBeat.o(24279);
  }

  public void onResume()
  {
    AppMethodBeat.i(24278);
    super.onResume();
    if (this.klq != null)
      this.klq.start();
    AppMethodBeat.o(24278);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI
 * JD-Core Version:    0.6.2
 */