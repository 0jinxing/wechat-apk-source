package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.d;
import com.tencent.mm.model.d.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.p;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;

public final class i extends a
  implements d.a, t.a, ap.a
{
  private d iaf;
  private HashMap<String, j.a> yVF;
  private boolean yVG;

  public i(c paramc)
  {
    super(paramc);
    AppMethodBeat.i(32177);
    this.yVG = false;
    this.yVG = false;
    this.yVF = new HashMap();
    o.all().a(this, Looper.getMainLooper());
    this.iaf = new d();
    AppMethodBeat.o(32177);
  }

  private void a(s params, k paramk)
  {
    AppMethodBeat.i(32181);
    if (params == null)
      AppMethodBeat.o(32181);
    while (true)
    {
      return;
      com.tencent.mm.modelvideo.u.ur(params.getFileName());
      paramk.dGG().yXk.setVisibility(0);
      paramk.dGG().yXk.setProgress(com.tencent.mm.modelvideo.u.g(params));
      o.all().a(this, Looper.getMainLooper());
      AppMethodBeat.o(32181);
    }
  }

  private static void a(k paramk, boolean paramBoolean)
  {
    AppMethodBeat.i(32183);
    if (paramk == null)
      AppMethodBeat.o(32183);
    while (true)
    {
      return;
      paramk.dGG().yXk.setVisibility(8);
      if (paramBoolean)
      {
        paramk.dGG().yXi.setVisibility(8);
        ((View)paramk.dGG().yXh).setVisibility(0);
        AppMethodBeat.o(32183);
      }
      else
      {
        paramk.dGG().yXi.setVisibility(0);
        ((View)paramk.dGG().yXh).setVisibility(8);
        AppMethodBeat.o(32183);
      }
    }
  }

  private boolean a(j.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(32185);
    if (parama == null)
      AppMethodBeat.o(32185);
    while (true)
    {
      return bool;
      o.all().a(this);
      if (this.yTG.yTI.getCurrentItem() == parama.pos)
      {
        parama = OJ(parama.pos);
        if (parama != null)
          parama.dGG().yXk.setVisibility(8);
        bool = true;
        AppMethodBeat.o(32185);
      }
      else
      {
        this.yTG.OR(parama.pos);
        AppMethodBeat.o(32185);
      }
    }
  }

  private void b(bi parambi, k paramk)
  {
    AppMethodBeat.i(32182);
    if (this.yVG)
      AppMethodBeat.o(32182);
    String str;
    while (true)
    {
      return;
      paramk.dGG().yXl.setVisibility(8);
      o.all();
      str = t.uh(parambi.field_imgPath);
      if (parambi.dtH())
      {
        Toast.makeText(this.yTG.yTI, 2131304251, 0).show();
        AppMethodBeat.o(32182);
      }
      else
      {
        if ((str != null) && (com.tencent.mm.vfs.e.ct(str)))
          break;
        Toast.makeText(this.yTG.yTI, 2131304251, 0).show();
        AppMethodBeat.o(32182);
      }
    }
    this.yTG.yTI.mController.ylL.getWindow().addFlags(128);
    Boolean localBoolean = (Boolean)paramk.yXf.get(str);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      ((View)paramk.dGG().yXh).setTag(str);
      paramk.dGG().yXj.setVisibility(8);
      paramk.dGG().yXh.stop();
      if (this.yTG.yTI.np(parambi.field_msgId) != 3)
        break label368;
      paramk.dGG().yXh.setMute(true);
      label229: paramk.dGG().yXh.setVideoPath(str);
      if (paramk.dGG().yXh.w(this.yTG.yTI.mController.ylL, false))
        break label384;
      paramk.dGG().yXj.setVisibility(0);
      paramk.dGG().yXj.setOnClickListener(new i.1(this, paramk));
      ((View)paramk.dGG().yXh).setVisibility(8);
      paramk.dGG().yXi.setVisibility(0);
    }
    while (true)
    {
      ab.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool requestFocus");
      this.iaf.a(this);
      ((View)paramk.dGG().yXh).setVisibility(0);
      AppMethodBeat.o(32182);
      break;
      label368: paramk.dGG().yXh.setMute(false);
      break label229;
      label384: ((View)paramk.dGG().yXh).setVisibility(0);
      paramk.dGG().yXi.setVisibility(8);
    }
  }

  public final boolean BI()
  {
    AppMethodBeat.i(32184);
    if (this.yTG == null)
      AppMethodBeat.o(32184);
    while (true)
    {
      return false;
      k localk = this.yTG.dFP();
      if (localk == null)
      {
        AppMethodBeat.o(32184);
      }
      else if (localk.yXg == null)
      {
        AppMethodBeat.o(32184);
      }
      else if (localk.dGG().yXg.getVisibility() != 0)
      {
        AppMethodBeat.o(32184);
      }
      else
      {
        a(localk, true);
        AppMethodBeat.o(32184);
      }
    }
  }

  public final void Du()
  {
    AppMethodBeat.i(32179);
    SparseArray localSparseArray = this.yTG.yyL;
    for (int i = 0; i < localSparseArray.size(); i++)
    {
      int j = localSparseArray.keyAt(i);
      if ((localSparseArray.get(j) != null) && (((View)localSparseArray.get(j)).getTag() != null))
      {
        k localk = (k)((View)localSparseArray.get(j)).getTag();
        if ((localk.yXg != null) && (localk.dGG().yXg.getVisibility() == 0))
        {
          localk.dGG().yXh.setVideoCallback(null);
          if ((((View)localk.dGG().yXh).getVisibility() == 0) && (localk != null))
          {
            a(localk, false);
            if (localk.dGG().yXh != null)
              localk.dGG().yXh.stop();
            ab.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
            this.iaf.cy(false);
            this.yTG.yTI.mController.ylL.getWindow().clearFlags(128);
          }
        }
      }
    }
    AppMethodBeat.o(32179);
  }

  public final void OZ(int paramInt)
  {
    AppMethodBeat.i(32180);
    bi localbi = this.yTG.Ou(paramInt);
    k localk = OJ(paramInt);
    if ((localbi == null) || (localk == null))
      AppMethodBeat.o(32180);
    while (true)
    {
      return;
      s locals = com.tencent.mm.modelvideo.u.ut(localbi.field_imgPath);
      if (locals != null)
      {
        if (localbi.field_isSend == 0)
        {
          if ((locals.status == 113) || (locals.status == 111) || (locals.status == 112))
          {
            a(locals, localk);
            AppMethodBeat.o(32180);
          }
          else if (locals.status == 198)
          {
            a(locals, localk);
            AppMethodBeat.o(32180);
          }
        }
        else
          b(localbi, localk);
      }
      else
        AppMethodBeat.o(32180);
    }
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(32187);
    Object localObject = parama.fileName;
    if ((ah.isNullOrNil((String)localObject)) || (this.yVF == null))
      AppMethodBeat.o(32187);
    while (true)
    {
      return;
      parama = (j.a)this.yVF.get(localObject);
      if (parama == null)
      {
        AppMethodBeat.o(32187);
      }
      else
      {
        bi localbi = parama.csG;
        if ((localbi == null) || (localbi.field_imgPath == null) || (!localbi.field_imgPath.equals(localObject)))
        {
          AppMethodBeat.o(32187);
        }
        else
        {
          localObject = com.tencent.mm.modelvideo.u.ut(localbi.field_imgPath);
          if (localObject == null)
          {
            AppMethodBeat.o(32187);
          }
          else if ((localbi.dtH()) || (((s)localObject).status == 198))
          {
            if (a(parama))
              Toast.makeText(this.yTG.yTI, 2131304251, 0).show();
            AppMethodBeat.o(32187);
          }
          else
          {
            int i = com.tencent.mm.modelvideo.u.g((s)localObject);
            localObject = OJ(parama.pos);
            if ((this.yTG.yTI.getCurrentItem() == parama.pos) && (localObject != null))
            {
              ((k)localObject).dGG().yXk.setVisibility(0);
              ((k)localObject).dGG().yXk.setProgress(i);
            }
            while (true)
              if (i < ((k)localObject).dGH().yXk.getMax())
              {
                AppMethodBeat.o(32187);
                break;
                if (localObject == null)
                {
                  AppMethodBeat.o(32187);
                  break;
                }
              }
            if (a(parama))
              b(localbi, (k)localObject);
            AppMethodBeat.o(32187);
          }
        }
      }
    }
  }

  public final boolean a(k paramk, bi parambi, int paramInt)
  {
    AppMethodBeat.i(32178);
    super.a(paramk, parambi, paramInt);
    o.all();
    Object localObject1 = BackwardSupportUtil.b.i(t.ui(parambi.field_imgPath), 1.0F);
    if (this.yVF != null)
      this.yVF.put(parambi.field_imgPath, new j.a(parambi, paramInt));
    a(paramk, false);
    ((View)paramk.dGG().yXh).setVisibility(8);
    paramk.dGG().yXi.setImageBitmap((Bitmap)localObject1);
    paramk.dGG().yXi.setVisibility(0);
    paramk.dGG().yXl.setVisibility(8);
    localObject1 = com.tencent.mm.modelvideo.u.ut(parambi.field_imgPath);
    paramk.yXl.setTag(localObject1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = null;
      if (localObject2 != null)
        break label202;
      paramk.mlK.setVisibility(8);
    }
    while (true)
    {
      if ((paramk.dGG().yXh instanceof VideoSightView))
        p.a(paramk.mlK, (VideoSightView)paramk.dGG().yXh);
      AppMethodBeat.o(32178);
      return true;
      localObject2 = ((s)localObject1).fXm;
      break;
      label202: if (ah.isNullOrNil(((cfh)localObject2).fiG))
      {
        ab.i("MicroMsg.ImageGallerySightHandler", " there is no attachurl, show more info btn");
        localObject1 = ((cfh)localObject2).fiJ;
        localObject2 = ((cfh)localObject2).fiK;
        if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil((String)localObject2)))
        {
          paramk.mlK.setText((CharSequence)localObject1);
          paramk.mlK.setVisibility(0);
          paramk.mlK.setTag(parambi);
        }
        else
        {
          paramk.mlK.setVisibility(8);
        }
      }
      else
      {
        paramk.mlK.setVisibility(0);
        paramk.mlK.setText(this.yTG.yTI.getString(2131303579, new Object[] { Integer.valueOf(((cfh)localObject2).wid) }));
        Object localObject3 = this.yTG.yTI.getString(2131303579);
        localObject1 = localObject3;
        if (((cfh)localObject2).wid / 60 > 0)
          localObject1 = (String)localObject3 + this.yTG.yTI.getString(2131303581, new Object[] { Integer.valueOf(((cfh)localObject2).wid / 60) });
        localObject3 = localObject1;
        if (((cfh)localObject2).wid % 60 > 0)
          localObject3 = (String)localObject1 + this.yTG.yTI.getString(2131303582, new Object[] { Integer.valueOf(((cfh)localObject2).wid % 60) });
        localObject1 = (String)localObject3 + this.yTG.yTI.getString(2131303580);
        paramk.mlK.setText((CharSequence)localObject1);
        paramk.mlK.setTag(parambi);
      }
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(32186);
    Du();
    this.yTG.yTI.mController.ylL.getWindow().clearFlags(128);
    this.yVG = true;
    super.detach();
    this.yVF.clear();
    this.yVF = null;
    o.all().a(this);
    ab.d("MicroMsg.ImageGallerySightHandler", "mAudioHelperTool abandonFocus");
    this.iaf.cy(true);
    AppMethodBeat.o(32186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.i
 * JD-Core Version:    0.6.2
 */