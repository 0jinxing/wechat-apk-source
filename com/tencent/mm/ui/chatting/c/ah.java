package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.g;
import com.tencent.mm.at.i.a;
import com.tencent.mm.at.l;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.tools.a.1;
import com.tencent.mm.ui.widget.DrawnCallBackLinearLayout;
import java.util.ArrayList;

@com.tencent.mm.ui.chatting.c.a.a(dFp=aa.class)
public class ah extends a
  implements i.a, aa
{
  private com.tencent.mm.ui.widget.a.c opc;

  public final void B(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(31670);
    if ((paramString == null) || (paramString.equals("")) || (!com.tencent.mm.vfs.e.ct(paramString)))
    {
      ab.d("MicroMsg.ChattingUI.SendImgComponent", " doSendImage : filePath is null or empty");
      AppMethodBeat.o(31670);
    }
    while (true)
    {
      return;
      if (i.ad(this.cgL.sRl))
      {
        AppMethodBeat.o(31670);
      }
      else
      {
        paramString = new l(4, this.cgL.dFu(), this.cgL.getTalkerUserName(), paramString, paramInt1, null, paramInt2, "", "", true, 2130838182);
        aw.Rg().a(paramString, 0);
        this.cgL.qp(true);
        AppMethodBeat.o(31670);
      }
    }
  }

  public final void a(ContextMenu paramContextMenu, int paramInt, bi parambi)
  {
    AppMethodBeat.i(31672);
    paramContextMenu.add(paramInt, 100, 0, this.cgL.yTx.getMMResources().getString(2131298153));
    com.tencent.mm.at.e locale1 = null;
    if (parambi.field_msgId > 0L)
      locale1 = com.tencent.mm.at.o.ahl().fJ(parambi.field_msgId);
    com.tencent.mm.at.e locale2;
    if (locale1 != null)
    {
      locale2 = locale1;
      if (locale1.fDy > 0L);
    }
    else
    {
      locale2 = locale1;
      if (parambi.field_msgSvrId > 0L)
        locale2 = com.tencent.mm.at.o.ahl().fI(parambi.field_msgSvrId);
    }
    if ((parambi.field_isSend == 1) || ((locale2 != null) && (parambi.field_isSend == 0) && (locale2.offset >= locale2.frO) && (locale2.frO != 0)))
      paramContextMenu.add(paramInt, 110, 0, this.cgL.yTx.getMMResources().getString(2131302491));
    if (locale2 == null);
    for (parambi = ""; ; parambi = com.tencent.mm.at.o.ahl().q(locale2.fDz, "", ""))
    {
      if ((locale2 != null) && (com.tencent.mm.vfs.e.ct(parambi)))
        paramContextMenu.add(paramInt, 112, 0, this.cgL.yTx.getMMResources().getString(2131298085));
      AppMethodBeat.o(31672);
      return;
    }
  }

  public final void a(SightCaptureResult paramSightCaptureResult)
  {
    AppMethodBeat.i(31669);
    String str = paramSightCaptureResult.osI;
    if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        boolean bool = paramSightCaptureResult.osB;
        ab.i("MicroMsg.ChattingUI.SendImgComponent", "doSendChattingImage, path: %s", new Object[] { str });
        paramSightCaptureResult = new com/tencent/mm/at/l;
        if (bool)
        {
          i = 2;
          paramSightCaptureResult.<init>(i, com.tencent.mm.model.r.Yz(), this.cgL.getTalkerUserName(), str, 1, null, 0, "", "", true, 2130838182);
          aw.Rg().a(paramSightCaptureResult, 0);
          AppMethodBeat.o(31669);
          return;
        }
        int i = 1;
        continue;
      }
      catch (Exception paramSightCaptureResult)
      {
        ab.e("MicroMsg.ChattingUI.SendImgComponent", "doSendChattingImage error: %s", new Object[] { paramSightCaptureResult.getMessage() });
      }
      AppMethodBeat.o(31669);
    }
  }

  public final boolean a(MenuItem paramMenuItem, bi parambi)
  {
    AppMethodBeat.i(31667);
    boolean bool;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = false;
      AppMethodBeat.o(31667);
    case 110:
    }
    while (true)
    {
      return bool;
      com.tencent.mm.ui.chatting.r.a(parambi, this.cgL.yTx.getContext(), this.cgL);
      bool = true;
      AppMethodBeat.o(31667);
    }
  }

  public final void b(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31673);
    ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).o(paramLong, paramInt1, paramInt2);
    AppMethodBeat.o(31673);
  }

  public final boolean bb(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(31671);
    if (!parambi.drE())
    {
      bool = false;
      AppMethodBeat.o(31671);
    }
    while (true)
    {
      return bool;
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        t.hO(this.cgL.yTx.getContext());
        AppMethodBeat.o(31671);
      }
      else
      {
        if (!this.cgL.getTalkerUserName().equals("medianote"))
        {
          aw.ZK();
          com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.e(parambi.field_talker, parambi.field_msgSvrId));
        }
        ak.aR(parambi);
        this.cgL.qp(true);
        AppMethodBeat.o(31671);
      }
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31679);
    super.dDh();
    com.tencent.mm.at.o.ahj().fEN = null;
    AppMethodBeat.o(31679);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31678);
    com.tencent.mm.at.o.ahj().fEN = null;
    AppMethodBeat.o(31678);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31677);
    com.tencent.mm.at.o.ahj().fEN = this;
    AppMethodBeat.o(31677);
  }

  public final boolean g(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    boolean bool1 = true;
    AppMethodBeat.i(31668);
    this.cgL.dismissDialog();
    boolean bool2;
    if (paramInt2 != -1)
    {
      ab.e("MicroMsg.ChattingUI.SendImgComponent", "[dealWithRequestCode] resultCode:%d", new Object[] { Integer.valueOf(paramInt2) });
      AppMethodBeat.o(31668);
      bool2 = false;
    }
    Object localObject1;
    Object localObject2;
    label210: Object localObject3;
    while (true)
    {
      return bool2;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(31668);
        bool2 = false;
        break;
      case 200:
        if (paramIntent == null)
        {
          AppMethodBeat.o(31668);
          bool2 = bool1;
        }
        else
        {
          localObject1 = new Intent();
          ((Intent)localObject1).setClassName(this.cgL.yTx.getContext(), "com.tencent.mm.ui.tools.CropImageNewUI");
          ((Intent)localObject1).putExtra("CropImageMode", 4);
          ((Intent)localObject1).putExtra("CropImage_Filter", true);
          localObject2 = this.cgL.getTalkerUserName();
          if ((localObject2 != null) && ((ad.aou((String)localObject2)) || (ad.aow((String)localObject2))))
          {
            bool2 = false;
            ((Intent)localObject1).putExtra("CropImage_Has_Raw_Img_Btn", bool2);
            ((Intent)localObject1).putExtra("from_source", 3);
            localObject2 = this.cgL.yTx;
            aw.ZK();
            localObject3 = com.tencent.mm.model.c.XW();
            if (paramIntent.getData().toString().startsWith("content://com.google.android.gallery3d"))
              break label323;
            paramIntent = com.tencent.mm.ui.tools.a.i(((MMFragment)localObject2).getContext(), paramIntent, (String)localObject3);
            if (!bo.isNullOrNil(paramIntent))
            {
              ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
              ((MMFragment)localObject2).startActivityForResult((Intent)localObject1, 203);
            }
          }
          while (true)
          {
            AppMethodBeat.o(31668);
            bool2 = bool1;
            break;
            bool2 = true;
            break label210;
            new a.1(paramIntent, (MMFragment)localObject2, (String)localObject3, (Intent)localObject1).execute(new Integer[] { Integer.valueOf(0) });
          }
        }
        break;
      case 201:
        label323: localObject1 = this.cgL.yTx.getContext().getApplicationContext();
        aw.ZK();
        localObject1 = com.tencent.mm.pluginsdk.ui.tools.n.h((Context)localObject1, paramIntent, com.tencent.mm.model.c.XW());
        if (localObject1 == null)
        {
          AppMethodBeat.o(31668);
          bool2 = bool1;
        }
        else
        {
          paramIntent = new Intent();
          localObject2 = new ArrayList(1);
          ((ArrayList)localObject2).add(localObject1);
          paramIntent.putExtra("query_source_type", 3);
          paramIntent.putExtra("preview_image", true);
          paramIntent.putExtra("isTakePhoto", true);
          paramIntent.putExtra("GalleryUI_FromUser", this.cgL.dFu());
          paramIntent.putExtra("GalleryUI_ToUser", this.cgL.getTalkerUserName());
          paramIntent.putExtra("is_long_click", true);
          paramIntent.putStringArrayListExtra("preview_image_list", (ArrayList)localObject2);
          paramIntent.addFlags(67108864);
          com.tencent.mm.bp.d.a(this.cgL.yTx, "gallery", ".ui.GalleryEntryUI", paramIntent, 217);
          AppMethodBeat.o(31668);
          bool2 = bool1;
        }
        break;
      case 217:
      case 203:
      }
    }
    if (paramIntent == null)
    {
      localObject1 = com.tencent.mm.at.n.ahb().sq(this.cgL.getTalkerUserName());
      if (((ArrayList)localObject1).size() > 0)
      {
        paramIntent = new Intent();
        paramIntent.putStringArrayListExtra("CropImage_OutputPath_List", (ArrayList)localObject1);
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).add(Integer.valueOf(-1));
        paramIntent.putIntegerArrayListExtra("GalleryUI_ImgIdList", (ArrayList)localObject1);
        com.tencent.mm.plugin.report.service.h.pYm.a(594L, 4L, 1L, true);
      }
    }
    while (true)
    {
      if (paramIntent == null)
      {
        ab.e("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
        AppMethodBeat.o(31668);
        bool2 = bool1;
        break;
      }
      localObject2 = paramIntent.getStringExtra("GalleryUI_ToUser");
      if (bo.isNullOrNil((String)localObject2));
      for (localObject1 = this.cgL.getTalkerUserName(); ; localObject1 = localObject2)
      {
        ab.i("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE userFromIntent:%s rawUsername:%s", new Object[] { localObject2, this.cgL.getTalkerUserName() });
        localObject3 = (com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class);
        ((com.tencent.mm.ui.chatting.c.b.o)localObject3).dDX().clearFocus();
        ((com.tencent.mm.ui.chatting.c.b.o)localObject3).dDX().setBottomPanelVisibility(8);
        localObject2 = (DrawnCallBackLinearLayout)this.cgL.findViewById(2131821521);
        if (localObject2 == null)
          break;
        ((DrawnCallBackLinearLayout)localObject2).setListener(new ah.1(this, paramIntent, (String)localObject1, (com.tencent.mm.ui.chatting.c.b.o)localObject3, paramInt1));
        break;
      }
      localObject1 = (com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class);
      localObject2 = paramIntent.getStringExtra("CropImage_OutputPath");
      if (localObject2 == null)
      {
        ((com.tencent.mm.ui.chatting.c.b.o)localObject1).dDX().clearFocus();
        AppMethodBeat.o(31668);
        bool2 = bool1;
        break;
      }
      bool2 = paramIntent.getBooleanExtra("CropImage_Compress_Img", true);
      bool2 = com.tencent.mm.model.r.g((String)localObject2, this.cgL.getTalkerUserName(), bool2);
      paramIntent.getIntExtra("from_source", 0);
      paramInt2 = paramIntent.getIntExtra("CropImage_rotateCount", 0);
      ab.d("MicroMsg.ChattingUI.SendImgComponent", "dkimgsource" + paramIntent.getIntExtra("from_source", 0));
      if (bool2);
      for (paramInt1 = i; ; paramInt1 = 0)
      {
        B(paramInt1, paramInt2, (String)localObject2);
        ((com.tencent.mm.ui.chatting.c.b.o)localObject1).dDX().clearFocus();
        break;
      }
    }
  }

  public final void k(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(31674);
    ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).B(paramLong, paramBoolean);
    AppMethodBeat.o(31674);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31676);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    g(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(31676);
  }

  public final void z(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(31675);
    com.tencent.mm.ui.chatting.c.b.o localo;
    ImageView localImageView;
    if (((this.opc == null) || (!this.opc.isShowing())) && (!bo.isNullOrNil(paramString2)) && (com.tencent.mm.sdk.platformtools.r.amn(paramString2)))
    {
      Object localObject = com.tencent.mm.sdk.platformtools.d.d(paramString2, 300, 300, false);
      if (localObject == null)
      {
        ab.e("MicroMsg.ChattingUI.SendImgComponent", "showAlert fail, bmp is null");
        AppMethodBeat.o(31675);
        return;
      }
      localo = (com.tencent.mm.ui.chatting.c.b.o)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.o.class);
      localImageView = new ImageView(this.cgL.yTx.getContext());
      int i = this.cgL.yTx.getMMResources().getDimensionPixelSize(2131427776);
      localImageView.setImageBitmap((Bitmap)localObject);
      localImageView.setPadding(i, i, i, i);
      localObject = Settings.Secure.getString(this.cgL.yTx.getContentResolver(), "default_input_method");
      if ((!com.tencent.mm.sdk.platformtools.r.bS(com.tencent.mm.vfs.e.e(paramString2, 0, -1))) || ((!((String)localObject).contains("com.sohu.inputmethod.sogou")) && (!((String)localObject).contains("com.tencent.qqpinyin"))))
        break label318;
    }
    label318: for (boolean bool = true; ; bool = false)
    {
      this.opc = com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131298240), localImageView, this.cgL.yTx.getMMResources().getString(2131296994), this.cgL.yTx.getMMResources().getString(2131296868), new ah.3(this, bool, localo, paramString2), null);
      paramString1 = paramString1.substring(0, paramInt);
      localo.dDX().postDelayed(new ah.4(this, localo, paramString1), 10L);
      AppMethodBeat.o(31675);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ah
 * JD-Core Version:    0.6.2
 */