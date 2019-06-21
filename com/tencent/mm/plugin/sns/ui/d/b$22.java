package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

final class b$22
  implements View.OnClickListener
{
  b$22(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40271);
    q localq;
    Object localObject1;
    String str1;
    Object localObject2;
    String str2;
    int i;
    if ((paramView.getTag() instanceof q))
    {
      localq = (q)paramView.getTag();
      localObject1 = (bau)localq.rin.xfI.wbK.get(0);
      str1 = localq.cwT;
      af.cnF().YS(str1);
      str1 = "";
      localObject2 = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id);
      str2 = "";
      String str3 = i.j((bau)localObject1);
      if (e.ct((String)localObject2 + str3))
      {
        str1 = (String)localObject2 + str3;
        str2 = (String)localObject2 + i.e((bau)localObject1);
      }
      if (e.ct((String)localObject2 + i.p((bau)localObject1)))
      {
        str1 = (String)localObject2 + i.p((bau)localObject1);
        str2 = (String)localObject2 + i.n((bau)localObject1);
      }
      localObject1 = new int[2];
      localObject2 = paramView.findViewById(2131827794);
      if (localObject2 == null)
        break label418;
      ((View)localObject2).getLocationInWindow((int[])localObject1);
      i = ((View)localObject2).getWidth();
    }
    for (int j = ((View)localObject2).getHeight(); ; j = paramView.getHeight())
    {
      paramView = new Intent();
      paramView.setClass(this.rKt.activity, SnsOnlineVideoActivity.class);
      paramView.putExtra("intent_videopath", str1);
      paramView.putExtra("intent_thumbpath", str2);
      paramView.putExtra("intent_localid", localq.cwT);
      paramView.putExtra("intent_isad", false);
      paramView.putExtra("intent_from_scene", this.rKt.cvd);
      paramView.putExtra("img_gallery_left", localObject1[0]);
      paramView.putExtra("img_gallery_top", localObject1[1]);
      paramView.putExtra("img_gallery_width", i);
      paramView.putExtra("img_gallery_height", j);
      this.rKt.activity.startActivity(paramView);
      this.rKt.activity.overridePendingTransition(0, 0);
      b.a(this.rKt, localq.rin);
      AppMethodBeat.o(40271);
      return;
      label418: paramView.getLocationInWindow((int[])localObject1);
      i = paramView.getWidth();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.22
 * JD-Core Version:    0.6.2
 */