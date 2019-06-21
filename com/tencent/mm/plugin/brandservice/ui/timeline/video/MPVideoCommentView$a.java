package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.a;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.protocal.protobuf.kl;
import com.tencent.mm.protocal.protobuf.tp;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentViewHolder;", "context", "Landroid/content/Context;", "list", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/BizComment;", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "(Landroid/content/Context;Ljava/util/LinkedList;Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;)V", "getController", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "setController", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;)V", "deleteStr", "", "fromFriend", "", "kotlin.jvm.PlatformType", "getFromFriend", "()Ljava/lang/String;", "setFromFriend", "(Ljava/lang/String;)V", "getCommentReply", "Lcom/tencent/mm/protocal/protobuf/CommentReply;", "info", "getItem", "position", "", "getItemCount", "getItemViewType", "initDeleteText", "", "textView", "Landroid/widget/TextView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDeleteComment", "req", "Lcom/tencent/mm/protocal/protobuf/AppMsgOperateCommentReq;", "openId", "setGood", "isGood", "", "num", "update", "items", "", "updateAuthorCommentContentView", "reply", "itemView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentContent;", "updateAuthorLikeStatus", "updateCommentContentView", "updateCommentLikeStatus", "BizCommentContent", "BizCommentViewHolder", "Companion", "plugin-brandservice_release"})
public final class MPVideoCommentView$a extends RecyclerView.a<MPVideoCommentView.a.b>
{
  static final String TAG = "MicroMsg.BizCommentItemAdapter";
  private static final int jWV = 1;
  private static com.tencent.mm.at.a.a.c jWW;
  public static final MPVideoCommentView.a.c jWX;
  private final Context context;
  final LinkedList<kl> eow;
  private String jWT;
  private CharSequence jWU;
  b jWx;

  static
  {
    AppMethodBeat.i(15241);
    jWX = new MPVideoCommentView.a.c((byte)0);
    TAG = "MicroMsg.BizCommentItemAdapter";
    jWV = 1;
    jWW = new c.a().ahE().ahD().ct(120, 120).a((com.tencent.mm.at.a.c.b)new f()).sD(com.tencent.mm.plugin.i.c.bGF()).ahG();
    AppMethodBeat.o(15241);
  }

  public MPVideoCommentView$a(Context paramContext, LinkedList<kl> paramLinkedList, b paramb)
  {
    AppMethodBeat.i(15240);
    this.context = paramContext;
    this.eow = paramLinkedList;
    this.jWx = paramb;
    this.jWT = this.context.getString(2131305923);
    AppMethodBeat.o(15240);
  }

  private final void a(TextView paramTextView, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(15239);
    String str = " " + com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c.G(this.context, paramInt);
    Object localObject = this.context.getResources();
    if (paramBoolean);
    for (paramInt = 2130837954; ; paramInt = 2130837953)
    {
      localObject = ((Resources)localObject).getDrawable(paramInt);
      paramInt = (int)paramTextView.getTextSize();
      ((Drawable)localObject).setBounds(0, 0, paramInt, paramInt);
      localObject = new a((Drawable)localObject);
      SpannableString localSpannableString = new SpannableString((CharSequence)"@");
      localSpannableString.setSpan(localObject, 0, 1, 33);
      paramTextView.setText(TextUtils.concat(new CharSequence[] { (CharSequence)localSpannableString, (CharSequence)str }));
      AppMethodBeat.o(15239);
      return;
    }
  }

  private final void a(kl paramkl, MPVideoCommentView.a.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(15237);
    if (paramkl == null)
    {
      AppMethodBeat.o(15237);
      return;
    }
    parama = parama.jWZ;
    j.o(parama, "itemView.likeTv");
    if (paramkl.vMP == 1);
    while (true)
    {
      a(parama, bool, paramkl.vMO);
      AppMethodBeat.o(15237);
      break;
      bool = false;
    }
  }

  private final void a(tp paramtp, MPVideoCommentView.a.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(15238);
    parama = parama.jWZ;
    j.o(parama, "itemView.likeTv");
    if (paramtp.waK == 1);
    while (true)
    {
      a(parama, bool, paramtp.waJ);
      AppMethodBeat.o(15238);
      return;
      bool = false;
    }
  }

  public final void a(ep paramep, String paramString)
  {
    AppMethodBeat.i(15233);
    j.p(paramep, "req");
    Iterator localIterator = this.eow.iterator();
    while (localIterator.hasNext())
    {
      kl localkl = (kl)localIterator.next();
      if ((paramep.vGr == localkl.vGr) && ((bo.isNullOrNil(paramString)) || (bo.isEqual(paramString, localkl.vGs))))
      {
        this.eow.remove(localkl);
        notifyDataSetChanged();
        AppMethodBeat.o(15233);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(15233);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(15234);
    int i = this.eow.size();
    AppMethodBeat.o(15234);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    return jWV;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView.a
 * JD-Core Version:    0.6.2
 */