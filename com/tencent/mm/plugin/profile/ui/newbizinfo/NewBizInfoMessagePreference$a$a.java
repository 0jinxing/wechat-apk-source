package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.l;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;

public final class NewBizInfoMessagePreference$a$a extends RecyclerView.v
  implements View.OnClickListener
{
  public TextView eku;
  public ImageView iyo;
  public LinearLayout kuD;
  public ImageView pnv;
  public View pqm;
  public com.tencent.mm.plugin.profile.ui.newbizinfo.b.b pqn;

  public NewBizInfoMessagePreference$a$a(NewBizInfoMessagePreference.a parama, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(23883);
    this.pnv = ((ImageView)paramView.findViewById(2131823048));
    this.iyo = ((ImageView)paramView.findViewById(2131823049));
    this.eku = ((TextView)paramView.findViewById(2131823050));
    this.kuD = ((LinearLayout)paramView.findViewById(2131822967));
    this.pqm = paramView.findViewById(2131823051);
    paramView.setOnClickListener(this);
    AppMethodBeat.o(23883);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23884);
    ab.i("MicroMsg.NewBizInfoMessagePreference", "onClick jump to url:%s", new Object[] { this.pqn.pqv });
    int i = NewBizInfoMessagePreference.a.a(this.pqo).getIntent().getIntExtra("KOpenArticleSceneFromScene", -1);
    Intent localIntent = new Intent();
    String str = l.c(this.pqn.pqv, 126, i, 0);
    localIntent.putExtra("rawUrl", str);
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("geta8key_scene", 3);
    Object localObject = NewBizInfoMessagePreference.a.a(this.pqo).getIntent().getStringExtra("prePublishId");
    if (!bo.isNullOrNil((String)localObject))
    {
      localIntent.putExtra("KPublisherId", (String)localObject);
      localIntent.putExtra("prePublishId", (String)localObject);
      localIntent.putExtra("preUsername", NewBizInfoMessagePreference.a.a(this.pqo).getIntent().getStringExtra("preUsername"));
      localIntent.putExtra("preChatName", NewBizInfoMessagePreference.a.a(this.pqo).getIntent().getStringExtra("preChatName"));
      localIntent.putExtra("preChatTYPE", NewBizInfoMessagePreference.a.a(this.pqo).getIntent().getIntExtra("preChatTYPE", 0));
      i = NewBizInfoMessagePreference.a.a(this.pqo).getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
      if ((this.pqn.type != 5) || (!((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
        break label567;
      localIntent.putExtra("biz_video_title", this.pqn.title);
      localIntent.putExtra("biz_video_desc", this.pqn.pqC);
      localIntent.putExtra("biz_video_icon_url", this.pqn.hAg);
      localIntent.putExtra("srcUsername", NewBizInfoMessagePreference.a.b(this.pqo).field_username);
      localIntent.putExtra("srcDisplayname", NewBizInfoMessagePreference.a.b(this.pqo).Oi());
      localIntent.putExtra("biz_video_item_show_type", this.pqn.type);
      localIntent.putExtra("biz_video_pub_time", this.pqn.oyB);
      localIntent.putExtra("biz_video_duration", this.pqn.eWK);
      localIntent.putExtra("biz_video_width", this.pqn.videoWidth);
      localIntent.putExtra("biz_video_height", this.pqn.videoHeight);
      localIntent.putExtra("biz_video_vid", this.pqn.fgd);
      localIntent.putExtra("biz_video_scene", 126);
      localIntent.putExtra("biz_video_subscene", i);
      ab.i("MicroMsg.NewBizInfoMessagePreference", "jump to native video");
      localObject = new int[2];
      paramView = paramView.findViewById(2131823048);
      if (paramView != null)
      {
        int j = paramView.getWidth();
        i = paramView.getHeight();
        paramView.getLocationInWindow((int[])localObject);
        localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", localObject[0]).putExtra("img_gallery_top", localObject[1]);
      }
      localIntent.addFlags(268435456);
      d.b(NewBizInfoMessagePreference.a.a(this.pqo), "brandservice", ".ui.timeline.video.BizVideoDetailUI", localIntent);
      AppMethodBeat.o(23884);
    }
    while (true)
    {
      return;
      localIntent.putExtra("prePublishId", "brand_profile");
      localIntent.putExtra("KPublisherId", "brand_profile");
      break;
      label567: if ((((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(6)) && (((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(NewBizInfoMessagePreference.a.a(this.pqo), str, this.pqn.type, 126, i, localIntent)))
      {
        ab.i("MicroMsg.NewBizInfoMessagePreference", "jump to TmplWebview");
        AppMethodBeat.o(23884);
      }
      else
      {
        d.b(NewBizInfoMessagePreference.a.a(this.pqo), "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(23884);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMessagePreference.a.a
 * JD-Core Version:    0.6.2
 */