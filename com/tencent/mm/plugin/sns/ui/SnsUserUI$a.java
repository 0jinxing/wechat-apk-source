package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ah;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

class SnsUserUI$a extends as.f
{
  private ax rzp = null;

  SnsUserUI$a(SnsUserUI paramSnsUserUI)
  {
  }

  public final void Ed(int paramInt)
  {
    AppMethodBeat.i(39812);
    n localn = af.cnF().DK(paramInt);
    if (localn == null)
      AppMethodBeat.o(39812);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClass(this.rDa, SnsCommentDetailUI.class);
      localIntent.putExtra("INTENT_TALKER", localn.field_userName);
      localIntent.putExtra("INTENT_SNS_LOCAL_ID", v.ap("sns_table_", paramInt));
      this.rDa.startActivityForResult(localIntent, 12);
      AppMethodBeat.o(39812);
    }
  }

  public void fw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39810);
    ab.i("MicroMsg.SnsUserUI", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(SnsUserUI.f(this.rDa)) });
    Object localObject;
    String str;
    Parcel localParcel;
    if ((SnsUserUI.f(this.rDa)) && (paramInt2 == -1))
    {
      g.RQ();
      localObject = (String)g.RP().Ry().get(ac.a.xLg, null);
      if (!bo.isNullOrNil((String)localObject))
      {
        g.RQ();
        str = (String)g.RP().Ry().get(ac.a.xLi, "");
        new ah().Fs().fk(str).ajK();
        localObject = com.tencent.d.f.e.atV((String)localObject);
        localParcel = Parcel.obtain();
        localParcel.unmarshall((byte[])localObject, 0, localObject.length);
        localParcel.setDataPosition(0);
      }
    }
    while (true)
    {
      try
      {
        localObject = (Intent)Intent.CREATOR.createFromParcel(localParcel);
        ((Intent)localObject).addFlags(268435456);
        ((Intent)localObject).setClass(this.rDa, SnsUploadUI.class);
        ((Intent)localObject).putExtra("KSessionID", str);
        this.rDa.startActivity((Intent)localObject);
        AppMethodBeat.o(39810);
        return;
      }
      catch (Exception localException)
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xLg, "");
        g.RQ();
        g.RP().Ry().set(ac.a.xLi, "");
      }
      this.rzp = new ax(this.rDa);
      this.rzp.rBl = new SnsUserUI.a.1(this);
      this.rzp.c(0, this.rDa.mController.ylL.getString(2131296923));
      this.rzp.rBm = new SnsUserUI.a.2(this);
      this.rzp.cuu();
      AppMethodBeat.o(39810);
      continue;
      Intent localIntent = new Intent(this.rDa, SnsGalleryUI.class);
      localIntent.putExtra("sns_gallery_userName", SnsUserUI.c(this.rDa));
      localIntent.putExtra("sns_gallery_is_self", SnsUserUI.f(this.rDa));
      localIntent.putExtra("sns_gallery_localId", paramInt1);
      localIntent.putExtra("sns_source", SnsUserUI.e(this.rDa));
      localIntent.putExtra("sns_gallery_st_time", SnsUserUI.a(this.rDa).rvy);
      localIntent.putExtra("sns_gallery_ed_time", SnsUserUI.a(this.rDa).rvz);
      if (SnsUserUI.a(this.rDa) != null)
      {
        localIntent.putExtra("sns_gallery_limit_seq", SnsUserUI.a(this.rDa).lQD);
        SnsUserUI.b(this.rDa).j(SnsUserUI.c(this.rDa), SnsUserUI.a(this.rDa).fv(paramInt1, paramInt2));
        localIntent.putExtra("sns_gallery_position", SnsUserUI.a(this.rDa).rvC);
      }
      this.rDa.startActivityForResult(localIntent, 8);
      AppMethodBeat.o(39810);
    }
  }

  public final void fx(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39811);
    n localn = af.cnF().DK(paramInt1);
    if (localn == null)
      AppMethodBeat.o(39811);
    while (true)
    {
      return;
      Intent localIntent;
      if (localn.field_type == 15)
      {
        localIntent = new Intent(this.rDa, SnsGalleryUI.class);
        localIntent.putExtra("sns_gallery_userName", SnsUserUI.c(this.rDa));
        localIntent.putExtra("sns_gallery_is_self", SnsUserUI.f(this.rDa));
        localIntent.putExtra("sns_gallery_localId", paramInt1);
        localIntent.putExtra("sns_source", SnsUserUI.e(this.rDa));
        localIntent.putExtra("sns_gallery_st_time", SnsUserUI.a(this.rDa).rvy);
        localIntent.putExtra("sns_gallery_ed_time", SnsUserUI.a(this.rDa).rvz);
        if (SnsUserUI.a(this.rDa) != null)
        {
          localIntent.putExtra("sns_gallery_limit_seq", SnsUserUI.a(this.rDa).lQD);
          SnsUserUI.b(this.rDa).j(SnsUserUI.c(this.rDa), SnsUserUI.a(this.rDa).fv(paramInt1, paramInt2));
          localIntent.putExtra("sns_gallery_position", SnsUserUI.a(this.rDa).rvC);
        }
        this.rDa.startActivityForResult(localIntent, 8);
        AppMethodBeat.o(39811);
      }
      else
      {
        localIntent = new Intent();
        localIntent.setClass(this.rDa, SnsCommentDetailUI.class);
        localIntent.putExtra("INTENT_TALKER", localn.field_userName);
        localIntent.putExtra("INTENT_SNS_LOCAL_ID", v.ap("sns_table_", paramInt1));
        this.rDa.startActivityForResult(localIntent, 12);
        AppMethodBeat.o(39811);
      }
    }
  }

  public final void fy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39813);
    ab.d("MicroMsg.SnsUserUI", "onFailLongClick localId:%s position:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    n localn = af.cnF().DK(paramInt1);
    if ((localn != null) && (localn.cnn()) && (localn.cqW()))
      SnsUserUI.b(this.rDa, paramInt1);
    AppMethodBeat.o(39813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.a
 * JD-Core Version:    0.6.2
 */