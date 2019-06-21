package com.tencent.mm.plugin.exdevice.f.a;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.i.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class e
{
  public static void a(Context paramContext, ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(19441);
    boolean bool;
    if (paramImageView != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (!al.isMainThread())
        break label41;
      b(paramImageView, paramString, 2131689920);
      AppMethodBeat.o(19441);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label41: al.d(new e.1(paramContext, paramImageView, paramString));
      AppMethodBeat.o(19441);
    }
  }

  public static boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(19444);
    if ((paramInt1 == 1001) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      if ((paramIntent == null) || (paramIntent.size() <= 0))
        break label327;
      paramString = (String)paramIntent.get(0);
      paramIntent = new Intent();
      paramIntent.putExtra("CropImageMode", 1);
      paramIntent.putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.euZ + "temp.cover");
      paramIntent.putExtra("CropImage_ImgPath", paramString);
      com.tencent.mm.bp.d.b(paramMMActivity, ".ui.tools.CropImageNewUI", paramIntent, 1002);
      AppMethodBeat.o(19444);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramInt1 == 1002) && (paramInt2 == -1))
      {
        paramIntent = d.Km(com.tencent.mm.compatible.util.e.euZ + "temp.cover");
        paramMMActivity = ad.bpg();
        paramMMActivity.appName = paramString;
        long l = System.currentTimeMillis();
        paramMMActivity.lvp = com.tencent.mm.al.c.a("uploadexdeivce", l, r.Zd().field_username, String.valueOf(l));
        String str = paramMMActivity.lvp;
        paramString = new g();
        paramString.egl = paramMMActivity;
        paramString.field_mediaId = str;
        paramString.field_fullpath = paramIntent;
        paramString.field_thumbpath = "";
        paramString.field_fileType = com.tencent.mm.i.a.efN;
        paramString.field_talker = "";
        paramString.field_priority = com.tencent.mm.i.a.efB;
        paramString.field_needStorage = true;
        paramString.field_isStreamMedia = false;
        paramString.field_appType = 200;
        paramString.field_bzScene = 2;
        if (!f.afx().e(paramString))
          ab.e("MicroMsg.ExdevicePictureUploader", "hy: cdntra addSendTask failed. clientid:%s", new Object[] { str });
        AppMethodBeat.o(19444);
        bool = true;
      }
      else
      {
        label327: AppMethodBeat.o(19444);
      }
    }
  }

  static void b(ImageView paramImageView, String paramString, int paramInt)
  {
    AppMethodBeat.i(19442);
    if ((!bo.isNullOrNil(paramString)) && (!"#".equals(paramString)))
    {
      ab.d("MicroMsg.ExdeviceRankUtil", "hy: set url to %s", new Object[] { paramString });
      ad.boZ().a(paramString, paramImageView, ad.Kk(paramString));
      AppMethodBeat.o(19442);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ExdeviceRankUtil", "hy: url is null or nill. set to default picture resource");
      paramImageView.setImageResource(paramInt);
      AppMethodBeat.o(19442);
    }
  }

  public static void e(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(19443);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList1.add(paramMMActivity.getString(2131299281));
    localLinkedList2.add(Integer.valueOf(0));
    h.a(paramMMActivity, "", localLinkedList1, localLinkedList2, null, true, new e.2(paramMMActivity));
    AppMethodBeat.o(19443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.e
 * JD-Core Version:    0.6.2
 */