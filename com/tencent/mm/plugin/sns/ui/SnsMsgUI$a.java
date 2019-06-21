package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.p;
import java.util.HashSet;
import java.util.Set;

final class SnsMsgUI$a extends p<j>
{
  int enb;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  int kmW;
  private Set<MMSlideDelView> nDv;
  protected MMSlideDelView.f ruf;

  public SnsMsgUI$a(SnsMsgUI paramSnsMsgUI, Context paramContext, j paramj)
  {
    super(paramContext, paramj);
    AppMethodBeat.i(39090);
    this.nDv = new HashSet();
    this.jJR = new SnsMsgUI.a.1(this);
    this.kmW = 10;
    this.enb = this.kmW;
    AppMethodBeat.o(39090);
  }

  public final void KC()
  {
    AppMethodBeat.i(39094);
    if ((af.cnK().baS() > 0) && (!SnsMsgUI.p(this.rub)))
      setCursor(af.cnK().cqF());
    while (true)
    {
      notifyDataSetChanged();
      AppMethodBeat.o(39094);
      return;
      this.enb = af.cnK().cqG();
      setCursor(af.cnK().DH(this.kmW));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(39092);
    bIf();
    KC();
    AppMethodBeat.o(39092);
  }

  public final void a(String paramString, m paramm)
  {
    try
    {
      AppMethodBeat.i(39093);
      super.a(paramString, paramm);
      AppMethodBeat.o(39093);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final void b(MMSlideDelView.f paramf)
  {
    this.ruf = paramf;
  }

  public final boolean bdn()
  {
    if (this.kmW >= this.enb);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int bdo()
  {
    AppMethodBeat.i(39095);
    int i;
    if (bdn())
    {
      if (SnsMsgUI.h(this.rub).getParent() != null)
        SnsMsgUI.c(this.rub).removeFooterView(SnsMsgUI.h(this.rub));
      i = 0;
      AppMethodBeat.o(39095);
    }
    while (true)
    {
      return i;
      this.kmW += 10;
      if (this.kmW <= this.enb)
      {
        i = 10;
        AppMethodBeat.o(39095);
      }
      else
      {
        this.kmW = this.enb;
        i = this.enb % 10;
        AppMethodBeat.o(39095);
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(39091);
    long l = ((j)getItem(paramInt)).field_snsID;
    AppMethodBeat.o(39091);
    return l;
  }

  // ERROR //
  public final View getView(int paramInt, View paramView, android.view.ViewGroup paramViewGroup)
  {
    // Byte code:
    //   0: ldc 172
    //   2: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: iload_1
    //   7: invokevirtual 163	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:getItem	(I)Ljava/lang/Object;
    //   10: checkcast 109	com/tencent/mm/plugin/sns/storage/j
    //   13: astore 4
    //   15: aload_2
    //   16: ifnull +13 -> 29
    //   19: aload_2
    //   20: invokevirtual 176	android/view/View:getTag	()Ljava/lang/Object;
    //   23: instanceof 10
    //   26: ifne +1080 -> 1106
    //   29: aload_0
    //   30: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   33: invokestatic 186	com/tencent/mm/ui/v:hu	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   36: ldc 187
    //   38: aconst_null
    //   39: invokevirtual 193	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;)Landroid/view/View;
    //   42: checkcast 195	com/tencent/mm/ui/base/MMSlideDelView
    //   45: astore 5
    //   47: aload_0
    //   48: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   51: invokestatic 186	com/tencent/mm/ui/v:hu	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   54: ldc 196
    //   56: aconst_null
    //   57: invokevirtual 193	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;)Landroid/view/View;
    //   60: astore_2
    //   61: new 10	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a
    //   64: dup
    //   65: aload_0
    //   66: invokespecial 197	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI$a;)V
    //   69: astore 6
    //   71: aload 6
    //   73: aload_2
    //   74: ldc 198
    //   76: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   79: checkcast 204	com/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView
    //   82: putfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   85: aload 6
    //   87: getfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   90: aload_0
    //   91: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   94: invokevirtual 212	com/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView:setWeakContext	(Landroid/content/Context;)V
    //   97: aload 6
    //   99: aload_2
    //   100: ldc 213
    //   102: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   105: checkcast 215	android/widget/TextView
    //   108: putfield 219	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:pnE	Landroid/widget/TextView;
    //   111: aload 6
    //   113: aload_2
    //   114: ldc 220
    //   116: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   119: checkcast 215	android/widget/TextView
    //   122: putfield 223	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruk	Landroid/widget/TextView;
    //   125: aload 6
    //   127: aload_2
    //   128: ldc 224
    //   130: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   133: checkcast 226	android/widget/ImageView
    //   136: putfield 230	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruj	Landroid/widget/ImageView;
    //   139: aload 6
    //   141: aload_2
    //   142: ldc 231
    //   144: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   147: checkcast 215	android/widget/TextView
    //   150: putfield 234	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:timeTv	Landroid/widget/TextView;
    //   153: aload 6
    //   155: aload_2
    //   156: ldc 235
    //   158: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   161: checkcast 237	com/tencent/mm/ui/MMImageView
    //   164: putfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   167: aload 6
    //   169: aload_2
    //   170: ldc 242
    //   172: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   175: checkcast 215	android/widget/TextView
    //   178: putfield 245	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rui	Landroid/widget/TextView;
    //   181: aload 6
    //   183: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   186: aload_0
    //   187: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   190: invokestatic 249	com/tencent/mm/plugin/sns/ui/SnsMsgUI:q	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Landroid/view/View$OnClickListener;
    //   193: invokevirtual 253	com/tencent/mm/ui/MMImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   196: aload 6
    //   198: aload 5
    //   200: ldc 254
    //   202: invokevirtual 255	com/tencent/mm/ui/base/MMSlideDelView:findViewById	(I)Landroid/view/View;
    //   205: putfield 259	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:jJW	Landroid/view/View;
    //   208: aload 6
    //   210: aload 5
    //   212: ldc_w 260
    //   215: invokevirtual 255	com/tencent/mm/ui/base/MMSlideDelView:findViewById	(I)Landroid/view/View;
    //   218: checkcast 215	android/widget/TextView
    //   221: putfield 263	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:jJX	Landroid/widget/TextView;
    //   224: aload 6
    //   226: aload_2
    //   227: ldc_w 264
    //   230: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   233: checkcast 226	android/widget/ImageView
    //   236: putfield 267	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rum	Landroid/widget/ImageView;
    //   239: aload 5
    //   241: aload_2
    //   242: invokevirtual 271	com/tencent/mm/ui/base/MMSlideDelView:setView	(Landroid/view/View;)V
    //   245: aload 5
    //   247: aload_0
    //   248: getfield 273	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:jJO	Lcom/tencent/mm/ui/base/MMSlideDelView$g;
    //   251: invokevirtual 277	com/tencent/mm/ui/base/MMSlideDelView:setPerformItemClickListener	(Lcom/tencent/mm/ui/base/MMSlideDelView$g;)V
    //   254: aload 5
    //   256: aload_0
    //   257: getfield 279	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:jJP	Lcom/tencent/mm/ui/base/MMSlideDelView$c;
    //   260: invokevirtual 283	com/tencent/mm/ui/base/MMSlideDelView:setGetViewPositionCallback	(Lcom/tencent/mm/ui/base/MMSlideDelView$c;)V
    //   263: aload 5
    //   265: aload_0
    //   266: getfield 54	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:jJR	Lcom/tencent/mm/ui/base/MMSlideDelView$d;
    //   269: invokevirtual 287	com/tencent/mm/ui/base/MMSlideDelView:setItemStatusCallBack	(Lcom/tencent/mm/ui/base/MMSlideDelView$d;)V
    //   272: aload 5
    //   274: iconst_0
    //   275: invokevirtual 291	com/tencent/mm/ui/base/MMSlideDelView:setEnable	(Z)V
    //   278: aload 5
    //   280: aload 6
    //   282: invokevirtual 295	android/view/View:setTag	(Ljava/lang/Object;)V
    //   285: aload 6
    //   287: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   290: aconst_null
    //   291: invokevirtual 296	com/tencent/mm/ui/MMImageView:setTag	(Ljava/lang/Object;)V
    //   294: aload 6
    //   296: aload 4
    //   298: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   301: putfield 299	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:cND	J
    //   304: aload 6
    //   306: getfield 259	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:jJW	Landroid/view/View;
    //   309: aload 4
    //   311: getfield 302	com/tencent/mm/plugin/sns/storage/j:rfb	I
    //   314: invokestatic 308	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   317: invokevirtual 295	android/view/View:setTag	(Ljava/lang/Object;)V
    //   320: aload 6
    //   322: getfield 259	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:jJW	Landroid/view/View;
    //   325: new 310	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$2
    //   328: dup
    //   329: aload_0
    //   330: invokespecial 311	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$2:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI$a;)V
    //   333: invokevirtual 312	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   336: new 314	com/tencent/mm/protocal/protobuf/can
    //   339: astore_2
    //   340: aload_2
    //   341: invokespecial 315	com/tencent/mm/protocal/protobuf/can:<init>	()V
    //   344: aload_2
    //   345: aload 4
    //   347: getfield 319	com/tencent/mm/plugin/sns/storage/j:field_curActionBuf	[B
    //   350: invokevirtual 323	com/tencent/mm/protocal/protobuf/can:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   353: checkcast 314	com/tencent/mm/protocal/protobuf/can
    //   356: astore 7
    //   358: new 314	com/tencent/mm/protocal/protobuf/can
    //   361: astore_2
    //   362: aload_2
    //   363: invokespecial 315	com/tencent/mm/protocal/protobuf/can:<init>	()V
    //   366: aload_2
    //   367: aload 4
    //   369: getfield 326	com/tencent/mm/plugin/sns/storage/j:field_refActionBuf	[B
    //   372: invokevirtual 323	com/tencent/mm/protocal/protobuf/can:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   375: checkcast 314	com/tencent/mm/protocal/protobuf/can
    //   378: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   381: astore_3
    //   382: aload_3
    //   383: invokestatic 336	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   386: ifne +13 -> 399
    //   389: aload_3
    //   390: invokestatic 340	com/tencent/mm/plugin/sns/model/af:cnk	()Ljava/lang/String;
    //   393: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   396: ifeq +725 -> 1121
    //   399: ldc_w 348
    //   402: astore_3
    //   403: aload 7
    //   405: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   408: invokestatic 336	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   411: ifne +795 -> 1206
    //   414: aload 6
    //   416: getfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   419: aload 7
    //   421: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   424: invokestatic 353	com/tencent/mm/pluginsdk/ui/a$b:b	(Landroid/widget/ImageView;Ljava/lang/String;)V
    //   427: aload 7
    //   429: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   432: astore_2
    //   433: aload 6
    //   435: getfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   438: aload_2
    //   439: bipush 6
    //   441: invokevirtual 357	com/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView:dk	(Ljava/lang/String;I)V
    //   444: aload_0
    //   445: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   448: invokestatic 361	com/tencent/mm/plugin/sns/ui/SnsMsgUI:s	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Ljava/lang/String;
    //   451: aload_2
    //   452: invokestatic 365	com/tencent/mm/sdk/platformtools/bo:isEqual	(Ljava/lang/String;Ljava/lang/String;)Z
    //   455: ifne +722 -> 1177
    //   458: aload 6
    //   460: getfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   463: astore 8
    //   465: invokestatic 371	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   468: pop
    //   469: aload 8
    //   471: ldc_w 373
    //   474: invokestatic 377	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   477: checkcast 373	com/tencent/mm/plugin/story/api/e
    //   480: aload_2
    //   481: invokeinterface 380 2 0
    //   486: invokevirtual 383	com/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView:setShowStoryHint	(Z)V
    //   489: aload 6
    //   491: getfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   494: astore 9
    //   496: new 385	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$3
    //   499: astore 8
    //   501: aload 8
    //   503: aload_0
    //   504: aload_2
    //   505: invokespecial 388	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$3:<init>	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI$a;Ljava/lang/String;)V
    //   508: aload 9
    //   510: aload 8
    //   512: invokevirtual 389	com/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   515: aload_0
    //   516: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   519: invokestatic 393	com/tencent/mm/plugin/sns/ui/SnsMsgUI:r	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Lcom/tencent/mm/storage/bd;
    //   522: aload 7
    //   524: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   527: invokeinterface 399 2 0
    //   532: astore_2
    //   533: aload_2
    //   534: ifnull +683 -> 1217
    //   537: aload_2
    //   538: invokevirtual 404	com/tencent/mm/n/a:Oj	()Ljava/lang/String;
    //   541: astore_2
    //   542: aload 6
    //   544: getfield 219	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:pnE	Landroid/widget/TextView;
    //   547: aload_0
    //   548: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   551: aload_2
    //   552: aload 6
    //   554: getfield 219	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:pnE	Landroid/widget/TextView;
    //   557: invokevirtual 408	android/widget/TextView:getTextSize	()F
    //   560: invokestatic 413	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;F)Landroid/text/SpannableString;
    //   563: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   566: invokestatic 421	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   569: aload 4
    //   571: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   574: invokevirtual 427	com/tencent/mm/plugin/sns/storage/o:kD	(J)Lcom/tencent/mm/plugin/sns/storage/n;
    //   577: astore_2
    //   578: aload_2
    //   579: ifnull +667 -> 1246
    //   582: aload_2
    //   583: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   586: bipush 21
    //   588: if_icmpne +658 -> 1246
    //   591: aload 6
    //   593: getfield 219	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:pnE	Landroid/widget/TextView;
    //   596: aload_0
    //   597: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   600: invokevirtual 436	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getResources	()Landroid/content/res/Resources;
    //   603: ldc_w 437
    //   606: invokevirtual 443	android/content/res/Resources:getColor	(I)I
    //   609: invokevirtual 446	android/widget/TextView:setTextColor	(I)V
    //   612: aload 7
    //   614: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   617: astore_2
    //   618: aload 6
    //   620: getfield 219	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:pnE	Landroid/widget/TextView;
    //   623: astore 8
    //   625: aload 7
    //   627: getfield 449	com/tencent/mm/protocal/protobuf/can:vFH	I
    //   630: istore 10
    //   632: aload 4
    //   634: getfield 450	com/tencent/mm/plugin/sns/storage/j:field_type	I
    //   637: tableswitch	default:+79 -> 716, 1:+639->1276, 2:+639->1276, 3:+633->1270, 4:+645->1282, 5:+633->1270, 6:+79->716, 7:+651->1288, 8:+651->1288, 9:+79->716, 10:+79->716, 11:+79->716, 12:+79->716, 13:+651->1288, 14:+651->1288, 15:+79->716, 16:+651->1288
    //   717: istore 11
    //   719: iload 11
    //   721: ifeq +17 -> 738
    //   724: aload_0
    //   725: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   728: invokestatic 361	com/tencent/mm/plugin/sns/ui/SnsMsgUI:s	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Ljava/lang/String;
    //   731: aload_2
    //   732: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   735: ifeq +559 -> 1294
    //   738: aload 8
    //   740: aconst_null
    //   741: aconst_null
    //   742: aconst_null
    //   743: aconst_null
    //   744: invokevirtual 454	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   747: aload 6
    //   749: getfield 223	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruk	Landroid/widget/TextView;
    //   752: astore 8
    //   754: aload 4
    //   756: getfield 457	com/tencent/mm/plugin/sns/storage/j:field_commentflag	I
    //   759: iconst_1
    //   760: iand
    //   761: ifle +682 -> 1443
    //   764: iconst_1
    //   765: istore 11
    //   767: iload 11
    //   769: ifeq +680 -> 1449
    //   772: aload 8
    //   774: ldc_w 458
    //   777: invokevirtual 460	android/widget/TextView:setText	(I)V
    //   780: aload 8
    //   782: aload_0
    //   783: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   786: invokevirtual 436	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getResources	()Landroid/content/res/Resources;
    //   789: ldc_w 461
    //   792: invokevirtual 443	android/content/res/Resources:getColor	(I)I
    //   795: invokevirtual 464	android/widget/TextView:setBackgroundColor	(I)V
    //   798: aload 8
    //   800: aconst_null
    //   801: aconst_null
    //   802: aconst_null
    //   803: aconst_null
    //   804: invokevirtual 454	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   807: aload 6
    //   809: getfield 234	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:timeTv	Landroid/widget/TextView;
    //   812: aload_0
    //   813: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   816: aload 7
    //   818: getfield 467	com/tencent/mm/protocal/protobuf/can:pcX	I
    //   821: i2l
    //   822: ldc2_w 468
    //   825: lmul
    //   826: invokestatic 475	com/tencent/mm/plugin/sns/ui/aw:l	(Landroid/content/Context;J)Ljava/lang/String;
    //   829: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   832: aconst_null
    //   833: astore_2
    //   834: aload 7
    //   836: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   839: bipush 7
    //   841: if_icmpeq +23 -> 864
    //   844: aload 7
    //   846: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   849: bipush 8
    //   851: if_icmpeq +13 -> 864
    //   854: aload 7
    //   856: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   859: bipush 16
    //   861: if_icmpne +1892 -> 2753
    //   864: invokestatic 482	com/tencent/mm/plugin/sns/model/af:cnI	()Lcom/tencent/mm/plugin/sns/storage/f;
    //   867: aload 4
    //   869: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   872: invokevirtual 488	com/tencent/mm/plugin/sns/storage/f:ku	(J)Lcom/tencent/mm/plugin/sns/storage/e;
    //   875: astore_3
    //   876: aload_3
    //   877: ifnull +8 -> 885
    //   880: aload_3
    //   881: invokevirtual 494	com/tencent/mm/plugin/sns/storage/e:cqB	()Lcom/tencent/mm/plugin/sns/storage/n;
    //   884: astore_2
    //   885: aload 6
    //   887: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   890: bipush 8
    //   892: invokevirtual 497	com/tencent/mm/ui/MMImageView:setVisibility	(I)V
    //   895: aload 6
    //   897: getfield 245	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rui	Landroid/widget/TextView;
    //   900: bipush 8
    //   902: invokevirtual 498	android/widget/TextView:setVisibility	(I)V
    //   905: aload 6
    //   907: getfield 267	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rum	Landroid/widget/ImageView;
    //   910: bipush 8
    //   912: invokevirtual 499	android/widget/ImageView:setVisibility	(I)V
    //   915: aload 6
    //   917: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   920: aconst_null
    //   921: invokevirtual 503	com/tencent/mm/ui/MMImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   924: invokestatic 507	com/tencent/mm/plugin/sns/model/af:cnC	()Lcom/tencent/mm/plugin/sns/model/g;
    //   927: aload 6
    //   929: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   932: invokevirtual 512	com/tencent/mm/plugin/sns/model/g:dB	(Landroid/view/View;)Z
    //   935: pop
    //   936: aload_2
    //   937: ifnull +2220 -> 3157
    //   940: aload_2
    //   941: invokevirtual 516	com/tencent/mm/plugin/sns/storage/n:cqu	()Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   944: getfield 522	com/tencent/mm/protocal/protobuf/TimeLineObject:xfI	Lcom/tencent/mm/protocal/protobuf/uf;
    //   947: getfield 528	com/tencent/mm/protocal/protobuf/uf:wbK	Ljava/util/LinkedList;
    //   950: astore 7
    //   952: aload_2
    //   953: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   956: iconst_2
    //   957: if_icmpne +1811 -> 2768
    //   960: aload 6
    //   962: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   965: aconst_null
    //   966: invokevirtual 296	com/tencent/mm/ui/MMImageView:setTag	(Ljava/lang/Object;)V
    //   969: aload 6
    //   971: getfield 245	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rui	Landroid/widget/TextView;
    //   974: iconst_0
    //   975: invokevirtual 498	android/widget/TextView:setVisibility	(I)V
    //   978: aload_0
    //   979: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   982: astore 7
    //   984: new 530	java/lang/StringBuilder
    //   987: astore_3
    //   988: aload_3
    //   989: invokespecial 531	java/lang/StringBuilder:<init>	()V
    //   992: aload 7
    //   994: aload_3
    //   995: aload_2
    //   996: invokevirtual 516	com/tencent/mm/plugin/sns/storage/n:cqu	()Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   999: getfield 534	com/tencent/mm/protocal/protobuf/TimeLineObject:xfF	Ljava/lang/String;
    //   1002: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1005: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1008: aload 6
    //   1010: getfield 245	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rui	Landroid/widget/TextView;
    //   1013: invokevirtual 408	android/widget/TextView:getTextSize	()F
    //   1016: invokestatic 413	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;F)Landroid/text/SpannableString;
    //   1019: astore_2
    //   1020: aload 6
    //   1022: getfield 245	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rui	Landroid/widget/TextView;
    //   1025: aload_2
    //   1026: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1029: aload 6
    //   1031: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   1034: invokevirtual 544	com/tencent/mm/ui/MMImageView:getVisibility	()I
    //   1037: ifeq +14 -> 1051
    //   1040: aload 6
    //   1042: getfield 267	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rum	Landroid/widget/ImageView;
    //   1045: invokevirtual 545	android/widget/ImageView:getVisibility	()I
    //   1048: ifne +2266 -> 3314
    //   1051: iconst_1
    //   1052: istore_1
    //   1053: aload 5
    //   1055: ldc_w 546
    //   1058: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   1061: astore_2
    //   1062: iload_1
    //   1063: ifeq +2256 -> 3319
    //   1066: iconst_0
    //   1067: istore_1
    //   1068: aload_2
    //   1069: iload_1
    //   1070: invokevirtual 547	android/view/View:setVisibility	(I)V
    //   1073: aload 5
    //   1075: ldc_w 548
    //   1078: invokevirtual 202	android/view/View:findViewById	(I)Landroid/view/View;
    //   1081: astore_2
    //   1082: aload 4
    //   1084: getfield 551	com/tencent/mm/plugin/sns/storage/j:field_isSilence	I
    //   1087: iconst_1
    //   1088: if_icmpne +2237 -> 3325
    //   1091: iconst_0
    //   1092: istore_1
    //   1093: aload_2
    //   1094: iload_1
    //   1095: invokevirtual 547	android/view/View:setVisibility	(I)V
    //   1098: ldc 172
    //   1100: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1103: aload 5
    //   1105: areturn
    //   1106: aload_2
    //   1107: invokevirtual 176	android/view/View:getTag	()Ljava/lang/Object;
    //   1110: checkcast 10	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a
    //   1113: astore 6
    //   1115: aload_2
    //   1116: astore 5
    //   1118: goto -833 -> 285
    //   1121: aload_0
    //   1122: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1125: invokestatic 393	com/tencent/mm/plugin/sns/ui/SnsMsgUI:r	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Lcom/tencent/mm/storage/bd;
    //   1128: aload_3
    //   1129: invokeinterface 399 2 0
    //   1134: astore 8
    //   1136: aload_3
    //   1137: astore_2
    //   1138: aload 8
    //   1140: ifnull +22 -> 1162
    //   1143: aload_3
    //   1144: astore_2
    //   1145: aload 8
    //   1147: invokevirtual 404	com/tencent/mm/n/a:Oj	()Ljava/lang/String;
    //   1150: invokestatic 336	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1153: ifne +9 -> 1162
    //   1156: aload 8
    //   1158: invokevirtual 404	com/tencent/mm/n/a:Oj	()Ljava/lang/String;
    //   1161: astore_2
    //   1162: aload_2
    //   1163: astore_3
    //   1164: goto -761 -> 403
    //   1167: astore_2
    //   1168: ldc_w 348
    //   1171: astore_2
    //   1172: aload_2
    //   1173: astore_3
    //   1174: goto -771 -> 403
    //   1177: aload 6
    //   1179: getfield 208	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:ruh	Lcom/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView;
    //   1182: iconst_0
    //   1183: invokevirtual 383	com/tencent/mm/plugin/sns/ui/widget/SnsAvatarImageView:setShowStoryHint	(Z)V
    //   1186: goto -697 -> 489
    //   1189: astore_2
    //   1190: ldc 112
    //   1192: aload_2
    //   1193: ldc_w 348
    //   1196: iconst_0
    //   1197: anewarray 553	java/lang/Object
    //   1200: invokestatic 557	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1203: goto -174 -> 1029
    //   1206: ldc 112
    //   1208: ldc_w 559
    //   1211: invokestatic 562	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1214: goto -699 -> 515
    //   1217: aload 7
    //   1219: getfield 565	com/tencent/mm/protocal/protobuf/can:wZD	Ljava/lang/String;
    //   1222: invokestatic 336	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1225: ifne +12 -> 1237
    //   1228: aload 7
    //   1230: getfield 565	com/tencent/mm/protocal/protobuf/can:wZD	Ljava/lang/String;
    //   1233: astore_2
    //   1234: goto -692 -> 542
    //   1237: aload 7
    //   1239: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   1242: astore_2
    //   1243: goto -701 -> 542
    //   1246: aload 6
    //   1248: getfield 219	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:pnE	Landroid/widget/TextView;
    //   1251: aload_0
    //   1252: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1255: invokevirtual 436	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getResources	()Landroid/content/res/Resources;
    //   1258: ldc_w 566
    //   1261: invokevirtual 443	android/content/res/Resources:getColor	(I)I
    //   1264: invokevirtual 446	android/widget/TextView:setTextColor	(I)V
    //   1267: goto -655 -> 612
    //   1270: iconst_1
    //   1271: istore 11
    //   1273: goto -554 -> 719
    //   1276: iconst_0
    //   1277: istore 11
    //   1279: goto -560 -> 719
    //   1282: iconst_0
    //   1283: istore 11
    //   1285: goto -566 -> 719
    //   1288: iconst_0
    //   1289: istore 11
    //   1291: goto -572 -> 719
    //   1294: iload 10
    //   1296: tableswitch	default:+68 -> 1364, 18:+105->1401, 19:+68->1364, 20:+68->1364, 21:+68->1364, 22:+91->1387, 23:+91->1387, 24:+91->1387, 25:+119->1415, 26:+91->1387, 27:+91->1387, 28:+91->1387, 29:+91->1387, 30:+133->1429
    //   1365: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1368: ldc_w 567
    //   1371: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1374: astore_2
    //   1375: aload 8
    //   1377: aconst_null
    //   1378: aconst_null
    //   1379: aload_2
    //   1380: aconst_null
    //   1381: invokevirtual 454	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1384: goto -637 -> 747
    //   1387: aload_0
    //   1388: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1391: ldc_w 574
    //   1394: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1397: astore_2
    //   1398: goto -23 -> 1375
    //   1401: aload_0
    //   1402: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1405: ldc_w 575
    //   1408: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1411: astore_2
    //   1412: goto -37 -> 1375
    //   1415: aload_0
    //   1416: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1419: ldc_w 576
    //   1422: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1425: astore_2
    //   1426: goto -51 -> 1375
    //   1429: aload_0
    //   1430: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1433: ldc_w 577
    //   1436: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1439: astore_2
    //   1440: goto -65 -> 1375
    //   1443: iconst_0
    //   1444: istore 11
    //   1446: goto -679 -> 767
    //   1449: aload 8
    //   1451: aload_0
    //   1452: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1455: invokevirtual 436	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getResources	()Landroid/content/res/Resources;
    //   1458: ldc_w 578
    //   1461: invokevirtual 443	android/content/res/Resources:getColor	(I)I
    //   1464: invokevirtual 446	android/widget/TextView:setTextColor	(I)V
    //   1467: aload 8
    //   1469: aconst_null
    //   1470: invokevirtual 582	android/widget/TextView:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   1473: aload 8
    //   1475: aconst_null
    //   1476: aconst_null
    //   1477: aconst_null
    //   1478: aconst_null
    //   1479: invokevirtual 454	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1482: aload 8
    //   1484: ldc_w 348
    //   1487: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1490: aload 8
    //   1492: iconst_0
    //   1493: invokevirtual 585	android/widget/TextView:setCompoundDrawablePadding	(I)V
    //   1496: aload 7
    //   1498: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   1501: tableswitch	default:+79 -> 1580, 1:+82->1583, 2:+252->1753, 3:+252->1753, 4:+637->2138, 5:+82->1583, 6:+79->1580, 7:+422->1923, 8:+464->1965, 9:+79->1580, 10:+79->1580, 11:+79->1580, 12:+79->1580, 13:+925->2426, 14:+754->2255, 15:+79->1580, 16:+655->2156
    //   1581: <illegal opcode>
    //   1582: <illegal opcode>
    //   1583: invokestatic 421	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   1586: aload 4
    //   1588: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   1591: invokevirtual 427	com/tencent/mm/plugin/sns/storage/o:kD	(J)Lcom/tencent/mm/plugin/sns/storage/n;
    //   1594: astore_3
    //   1595: aload_3
    //   1596: ifnull +30 -> 1626
    //   1599: aload_3
    //   1600: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   1603: bipush 7
    //   1605: if_icmpne +21 -> 1626
    //   1608: aload 8
    //   1610: aload_0
    //   1611: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1614: ldc_w 586
    //   1617: invokevirtual 590	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getString	(I)Ljava/lang/String;
    //   1620: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1623: goto -816 -> 807
    //   1626: aload_0
    //   1627: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1630: ldc_w 591
    //   1633: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1636: astore_2
    //   1637: aload_3
    //   1638: ifnull +108 -> 1746
    //   1641: aload_3
    //   1642: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   1645: bipush 21
    //   1647: if_icmpne +99 -> 1746
    //   1650: aload_2
    //   1651: aload_0
    //   1652: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1655: invokevirtual 436	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getResources	()Landroid/content/res/Resources;
    //   1658: ldc_w 592
    //   1661: invokevirtual 443	android/content/res/Resources:getColor	(I)I
    //   1664: getstatic 598	android/graphics/PorterDuff$Mode:SRC_ATOP	Landroid/graphics/PorterDuff$Mode;
    //   1667: invokevirtual 604	android/graphics/drawable/Drawable:setColorFilter	(ILandroid/graphics/PorterDuff$Mode;)V
    //   1670: aload_2
    //   1671: iconst_0
    //   1672: iconst_0
    //   1673: aload_2
    //   1674: invokevirtual 607	android/graphics/drawable/Drawable:getIntrinsicWidth	()I
    //   1677: aload_2
    //   1678: invokevirtual 610	android/graphics/drawable/Drawable:getIntrinsicHeight	()I
    //   1681: invokevirtual 614	android/graphics/drawable/Drawable:setBounds	(IIII)V
    //   1684: new 616	android/text/SpannableString
    //   1687: astore_3
    //   1688: aload_3
    //   1689: ldc_w 618
    //   1692: invokespecial 620	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   1695: new 622	android/text/style/ImageSpan
    //   1698: astore 9
    //   1700: aload 9
    //   1702: aload_2
    //   1703: invokespecial 624	android/text/style/ImageSpan:<init>	(Landroid/graphics/drawable/Drawable;)V
    //   1706: aload_3
    //   1707: aload 9
    //   1709: iconst_0
    //   1710: iconst_1
    //   1711: bipush 18
    //   1713: invokevirtual 628	android/text/SpannableString:setSpan	(Ljava/lang/Object;III)V
    //   1716: aload 8
    //   1718: aload_3
    //   1719: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1722: aload 8
    //   1724: aload_0
    //   1725: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1728: getfield 634	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1731: getfield 640	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1734: ldc_w 641
    //   1737: invokevirtual 644	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1740: invokevirtual 647	android/widget/TextView:setContentDescription	(Ljava/lang/CharSequence;)V
    //   1743: goto -936 -> 807
    //   1746: aload_2
    //   1747: invokevirtual 650	android/graphics/drawable/Drawable:clearColorFilter	()V
    //   1750: goto -80 -> 1670
    //   1753: aload 7
    //   1755: getfield 653	com/tencent/mm/protocal/protobuf/can:ncM	Ljava/lang/String;
    //   1758: astore 9
    //   1760: ldc_w 348
    //   1763: astore_2
    //   1764: invokestatic 482	com/tencent/mm/plugin/sns/model/af:cnI	()Lcom/tencent/mm/plugin/sns/storage/f;
    //   1767: aload 4
    //   1769: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   1772: invokevirtual 488	com/tencent/mm/plugin/sns/storage/f:ku	(J)Lcom/tencent/mm/plugin/sns/storage/e;
    //   1775: astore 12
    //   1777: aload 7
    //   1779: getfield 656	com/tencent/mm/protocal/protobuf/can:wZL	I
    //   1782: iconst_1
    //   1783: invokestatic 662	com/tencent/mm/plugin/sns/ui/widget/d:fF	(II)Z
    //   1786: ifeq +108 -> 1894
    //   1789: aload 12
    //   1791: ifnull +54 -> 1845
    //   1794: invokestatic 371	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   1797: pop
    //   1798: ldc_w 664
    //   1801: invokestatic 668	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   1804: checkcast 664	com/tencent/mm/plugin/messenger/foundation/a/j
    //   1807: invokeinterface 672 1 0
    //   1812: aload 12
    //   1814: getfield 675	com/tencent/mm/plugin/sns/storage/e:field_userName	Ljava/lang/String;
    //   1817: invokeinterface 678 2 0
    //   1822: astore_2
    //   1823: aload_0
    //   1824: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1827: ldc_w 679
    //   1830: iconst_1
    //   1831: anewarray 553	java/lang/Object
    //   1834: dup
    //   1835: iconst_0
    //   1836: aload_2
    //   1837: invokevirtual 682	com/tencent/mm/storage/ad:Oj	()Ljava/lang/String;
    //   1840: aastore
    //   1841: invokevirtual 687	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1844: astore_2
    //   1845: new 530	java/lang/StringBuilder
    //   1848: astore_3
    //   1849: aload_3
    //   1850: invokespecial 531	java/lang/StringBuilder:<init>	()V
    //   1853: aload_3
    //   1854: aload_2
    //   1855: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1858: aload 9
    //   1860: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1863: ldc_w 618
    //   1866: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1869: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1872: astore_2
    //   1873: aload 8
    //   1875: aload_0
    //   1876: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1879: aload_2
    //   1880: aload 8
    //   1882: invokevirtual 408	android/widget/TextView:getTextSize	()F
    //   1885: invokestatic 413	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;F)Landroid/text/SpannableString;
    //   1888: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1891: goto -1084 -> 807
    //   1894: aload_3
    //   1895: invokestatic 336	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1898: ifne -53 -> 1845
    //   1901: aload_0
    //   1902: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1905: ldc_w 688
    //   1908: iconst_1
    //   1909: anewarray 553	java/lang/Object
    //   1912: dup
    //   1913: iconst_0
    //   1914: aload_3
    //   1915: aastore
    //   1916: invokevirtual 687	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1919: astore_2
    //   1920: goto -75 -> 1845
    //   1923: aload 8
    //   1925: aload_0
    //   1926: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   1929: ldc_w 591
    //   1932: invokestatic 573	com/tencent/mm/bz/a:g	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1935: aconst_null
    //   1936: aconst_null
    //   1937: aconst_null
    //   1938: invokevirtual 454	android/widget/TextView:setCompoundDrawablesWithIntrinsicBounds	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1941: aload 8
    //   1943: aload_0
    //   1944: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   1947: getfield 634	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   1950: getfield 640	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   1953: ldc_w 641
    //   1956: invokevirtual 644	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   1959: invokevirtual 647	android/widget/TextView:setContentDescription	(Ljava/lang/CharSequence;)V
    //   1962: goto -1155 -> 807
    //   1965: ldc_w 348
    //   1968: astore_2
    //   1969: aload 7
    //   1971: getfield 653	com/tencent/mm/protocal/protobuf/can:ncM	Ljava/lang/String;
    //   1974: invokestatic 692	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   1977: astore 9
    //   1979: invokestatic 482	com/tencent/mm/plugin/sns/model/af:cnI	()Lcom/tencent/mm/plugin/sns/storage/f;
    //   1982: aload 4
    //   1984: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   1987: invokevirtual 488	com/tencent/mm/plugin/sns/storage/f:ku	(J)Lcom/tencent/mm/plugin/sns/storage/e;
    //   1990: astore 12
    //   1992: aload 7
    //   1994: getfield 656	com/tencent/mm/protocal/protobuf/can:wZL	I
    //   1997: iconst_1
    //   1998: invokestatic 662	com/tencent/mm/plugin/sns/ui/widget/d:fF	(II)Z
    //   2001: ifeq +108 -> 2109
    //   2004: aload 12
    //   2006: ifnull +54 -> 2060
    //   2009: invokestatic 371	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   2012: pop
    //   2013: ldc_w 664
    //   2016: invokestatic 668	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   2019: checkcast 664	com/tencent/mm/plugin/messenger/foundation/a/j
    //   2022: invokeinterface 672 1 0
    //   2027: aload 12
    //   2029: getfield 675	com/tencent/mm/plugin/sns/storage/e:field_userName	Ljava/lang/String;
    //   2032: invokeinterface 678 2 0
    //   2037: astore_2
    //   2038: aload_0
    //   2039: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   2042: ldc_w 679
    //   2045: iconst_1
    //   2046: anewarray 553	java/lang/Object
    //   2049: dup
    //   2050: iconst_0
    //   2051: aload_2
    //   2052: invokevirtual 682	com/tencent/mm/storage/ad:Oj	()Ljava/lang/String;
    //   2055: aastore
    //   2056: invokevirtual 687	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2059: astore_2
    //   2060: new 530	java/lang/StringBuilder
    //   2063: astore_3
    //   2064: aload_3
    //   2065: invokespecial 531	java/lang/StringBuilder:<init>	()V
    //   2068: aload_3
    //   2069: aload_2
    //   2070: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2073: aload 9
    //   2075: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2078: ldc_w 618
    //   2081: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2084: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2087: astore_2
    //   2088: aload 8
    //   2090: aload_0
    //   2091: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2094: aload_2
    //   2095: aload 8
    //   2097: invokevirtual 408	android/widget/TextView:getTextSize	()F
    //   2100: invokestatic 413	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;F)Landroid/text/SpannableString;
    //   2103: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   2106: goto -1299 -> 807
    //   2109: aload_3
    //   2110: invokestatic 336	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   2113: ifne -53 -> 2060
    //   2116: aload_0
    //   2117: getfield 180	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:context	Landroid/content/Context;
    //   2120: ldc_w 688
    //   2123: iconst_1
    //   2124: anewarray 553	java/lang/Object
    //   2127: dup
    //   2128: iconst_0
    //   2129: aload_3
    //   2130: aastore
    //   2131: invokevirtual 687	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2134: astore_2
    //   2135: goto -75 -> 2060
    //   2138: aload 8
    //   2140: aload_0
    //   2141: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2144: ldc_w 693
    //   2147: invokevirtual 590	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getString	(I)Ljava/lang/String;
    //   2150: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   2153: goto -1346 -> 807
    //   2156: new 530	java/lang/StringBuilder
    //   2159: astore_2
    //   2160: aload_2
    //   2161: invokespecial 531	java/lang/StringBuilder:<init>	()V
    //   2164: aload_2
    //   2165: ldc_w 348
    //   2168: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2171: ldc_w 695
    //   2174: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2177: aload_0
    //   2178: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2181: ldc_w 696
    //   2184: invokevirtual 590	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getString	(I)Ljava/lang/String;
    //   2187: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2190: ldc_w 698
    //   2193: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2196: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2199: astore_2
    //   2200: new 530	java/lang/StringBuilder
    //   2203: astore_3
    //   2204: aload_3
    //   2205: invokespecial 531	java/lang/StringBuilder:<init>	()V
    //   2208: aload_3
    //   2209: aload_2
    //   2210: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2213: ldc_w 618
    //   2216: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2219: aload 7
    //   2221: getfield 653	com/tencent/mm/protocal/protobuf/can:ncM	Ljava/lang/String;
    //   2224: invokestatic 692	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   2227: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2230: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2233: astore_2
    //   2234: aload 8
    //   2236: aload_0
    //   2237: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2240: aload_2
    //   2241: aload 8
    //   2243: invokevirtual 408	android/widget/TextView:getTextSize	()F
    //   2246: invokestatic 413	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;F)Landroid/text/SpannableString;
    //   2249: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   2252: goto -1445 -> 807
    //   2255: new 700	com/tencent/mm/protocal/protobuf/ata
    //   2258: astore_2
    //   2259: aload_2
    //   2260: invokespecial 701	com/tencent/mm/protocal/protobuf/ata:<init>	()V
    //   2263: new 530	java/lang/StringBuilder
    //   2266: astore_3
    //   2267: aload_3
    //   2268: ldc_w 703
    //   2271: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2274: ldc 112
    //   2276: aload_3
    //   2277: aload 7
    //   2279: getfield 710	com/tencent/mm/protocal/protobuf/can:wZK	Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
    //   2282: invokevirtual 713	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2285: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2288: invokestatic 715	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2291: aload_2
    //   2292: aload 7
    //   2294: getfield 710	com/tencent/mm/protocal/protobuf/can:wZK	Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
    //   2297: invokestatic 720	com/tencent/mm/platformtools/aa:a	(Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;)[B
    //   2300: invokevirtual 721	com/tencent/mm/protocal/protobuf/ata:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   2303: pop
    //   2304: new 530	java/lang/StringBuilder
    //   2307: astore_3
    //   2308: aload_3
    //   2309: ldc_w 723
    //   2312: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2315: ldc 112
    //   2317: aload_3
    //   2318: aload_2
    //   2319: getfield 726	com/tencent/mm/protocal/protobuf/ata:cSh	J
    //   2322: invokevirtual 729	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2325: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2328: invokestatic 715	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2331: aload_0
    //   2332: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2335: invokestatic 393	com/tencent/mm/plugin/sns/ui/SnsMsgUI:r	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Lcom/tencent/mm/storage/bd;
    //   2338: aload 7
    //   2340: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   2343: invokeinterface 399 2 0
    //   2348: astore_3
    //   2349: aload 8
    //   2351: aload_0
    //   2352: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2355: ldc_w 730
    //   2358: iconst_2
    //   2359: anewarray 553	java/lang/Object
    //   2362: dup
    //   2363: iconst_0
    //   2364: aload_3
    //   2365: invokevirtual 404	com/tencent/mm/n/a:Oj	()Ljava/lang/String;
    //   2368: aastore
    //   2369: dup
    //   2370: iconst_1
    //   2371: aload_2
    //   2372: getfield 726	com/tencent/mm/protocal/protobuf/ata:cSh	J
    //   2375: l2d
    //   2376: ldc2_w 731
    //   2379: ddiv
    //   2380: invokestatic 736	com/tencent/mm/sdk/platformtools/bo:F	(D)Ljava/lang/String;
    //   2383: aastore
    //   2384: invokevirtual 737	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2387: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   2390: goto -1583 -> 807
    //   2393: astore 9
    //   2395: new 530	java/lang/StringBuilder
    //   2398: astore_3
    //   2399: aload_3
    //   2400: ldc_w 739
    //   2403: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2406: ldc 112
    //   2408: aload_3
    //   2409: aload 9
    //   2411: invokevirtual 742	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   2414: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2417: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2420: invokestatic 562	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2423: goto -92 -> 2331
    //   2426: new 700	com/tencent/mm/protocal/protobuf/ata
    //   2429: astore 9
    //   2431: aload 9
    //   2433: invokespecial 701	com/tencent/mm/protocal/protobuf/ata:<init>	()V
    //   2436: new 530	java/lang/StringBuilder
    //   2439: astore_2
    //   2440: aload_2
    //   2441: ldc_w 703
    //   2444: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2447: ldc 112
    //   2449: aload_2
    //   2450: aload 7
    //   2452: getfield 710	com/tencent/mm/protocal/protobuf/can:wZK	Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
    //   2455: invokevirtual 713	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2458: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2461: invokestatic 715	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2464: aload 9
    //   2466: aload 7
    //   2468: getfield 710	com/tencent/mm/protocal/protobuf/can:wZK	Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
    //   2471: invokestatic 720	com/tencent/mm/platformtools/aa:a	(Lcom/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;)[B
    //   2474: invokevirtual 721	com/tencent/mm/protocal/protobuf/ata:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   2477: pop
    //   2478: new 530	java/lang/StringBuilder
    //   2481: astore_2
    //   2482: aload_2
    //   2483: ldc_w 723
    //   2486: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2489: ldc 112
    //   2491: aload_2
    //   2492: aload 9
    //   2494: getfield 726	com/tencent/mm/protocal/protobuf/ata:cSh	J
    //   2497: invokevirtual 729	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2500: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2503: invokestatic 715	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2506: aload_0
    //   2507: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2510: invokestatic 393	com/tencent/mm/plugin/sns/ui/SnsMsgUI:r	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;)Lcom/tencent/mm/storage/bd;
    //   2513: aload 7
    //   2515: getfield 330	com/tencent/mm/protocal/protobuf/can:wPm	Ljava/lang/String;
    //   2518: invokeinterface 399 2 0
    //   2523: pop
    //   2524: aconst_null
    //   2525: astore_3
    //   2526: aload 9
    //   2528: getfield 726	com/tencent/mm/protocal/protobuf/ata:cSh	J
    //   2531: lconst_0
    //   2532: lcmp
    //   2533: ifne +138 -> 2671
    //   2536: aload_0
    //   2537: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2540: iconst_1
    //   2541: invokestatic 745	com/tencent/mm/plugin/sns/ui/SnsMsgUI:b	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;Z)Z
    //   2544: pop
    //   2545: new 616	android/text/SpannableString
    //   2548: astore_2
    //   2549: aload_2
    //   2550: aload_0
    //   2551: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2554: ldc_w 746
    //   2557: invokevirtual 590	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getString	(I)Ljava/lang/String;
    //   2560: invokespecial 620	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   2563: aload_3
    //   2564: ifnull +67 -> 2631
    //   2567: aload_3
    //   2568: iconst_0
    //   2569: iconst_0
    //   2570: aload_3
    //   2571: invokevirtual 607	android/graphics/drawable/Drawable:getIntrinsicWidth	()I
    //   2574: aload_3
    //   2575: invokevirtual 610	android/graphics/drawable/Drawable:getIntrinsicHeight	()I
    //   2578: invokevirtual 614	android/graphics/drawable/Drawable:setBounds	(IIII)V
    //   2581: new 748	com/tencent/mm/ui/widget/a
    //   2584: astore 9
    //   2586: aload 9
    //   2588: aload_3
    //   2589: invokespecial 749	com/tencent/mm/ui/widget/a:<init>	(Landroid/graphics/drawable/Drawable;)V
    //   2592: aload 9
    //   2594: aload_3
    //   2595: invokevirtual 610	android/graphics/drawable/Drawable:getIntrinsicHeight	()I
    //   2598: i2f
    //   2599: aload 8
    //   2601: invokevirtual 408	android/widget/TextView:getTextSize	()F
    //   2604: fsub
    //   2605: aload_0
    //   2606: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2609: iconst_2
    //   2610: invokestatic 753	com/tencent/mm/bz/a:fromDPToPix	(Landroid/content/Context;I)I
    //   2613: i2f
    //   2614: fadd
    //   2615: fconst_2
    //   2616: fdiv
    //   2617: f2i
    //   2618: putfield 756	com/tencent/mm/ui/widget/a:zLT	I
    //   2621: aload_2
    //   2622: aload 9
    //   2624: iconst_0
    //   2625: iconst_1
    //   2626: bipush 33
    //   2628: invokevirtual 628	android/text/SpannableString:setSpan	(Ljava/lang/Object;III)V
    //   2631: aload 8
    //   2633: aload_2
    //   2634: invokevirtual 417	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   2637: goto -1830 -> 807
    //   2640: astore_2
    //   2641: new 530	java/lang/StringBuilder
    //   2644: astore_3
    //   2645: aload_3
    //   2646: ldc_w 739
    //   2649: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2652: ldc 112
    //   2654: aload_3
    //   2655: aload_2
    //   2656: invokevirtual 742	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   2659: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2662: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2665: invokestatic 562	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2668: goto -162 -> 2506
    //   2671: aload_0
    //   2672: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2675: iconst_0
    //   2676: invokestatic 745	com/tencent/mm/plugin/sns/ui/SnsMsgUI:b	(Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;Z)Z
    //   2679: pop
    //   2680: new 616	android/text/SpannableString
    //   2683: astore_2
    //   2684: new 530	java/lang/StringBuilder
    //   2687: astore_3
    //   2688: aload_3
    //   2689: ldc_w 618
    //   2692: invokespecial 706	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2695: aload_2
    //   2696: aload_3
    //   2697: aload_0
    //   2698: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2701: ldc_w 757
    //   2704: iconst_1
    //   2705: anewarray 553	java/lang/Object
    //   2708: dup
    //   2709: iconst_0
    //   2710: aload 9
    //   2712: getfield 726	com/tencent/mm/protocal/protobuf/ata:cSh	J
    //   2715: l2d
    //   2716: ldc2_w 731
    //   2719: ddiv
    //   2720: invokestatic 736	com/tencent/mm/sdk/platformtools/bo:F	(D)Ljava/lang/String;
    //   2723: aastore
    //   2724: invokevirtual 737	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   2727: invokevirtual 538	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2730: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2733: invokespecial 620	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   2736: aload_0
    //   2737: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2740: invokevirtual 436	com/tencent/mm/plugin/sns/ui/SnsMsgUI:getResources	()Landroid/content/res/Resources;
    //   2743: ldc_w 758
    //   2746: invokevirtual 762	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   2749: astore_3
    //   2750: goto -187 -> 2563
    //   2753: invokestatic 421	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   2756: aload 4
    //   2758: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   2761: invokevirtual 427	com/tencent/mm/plugin/sns/storage/o:kD	(J)Lcom/tencent/mm/plugin/sns/storage/n;
    //   2764: astore_2
    //   2765: goto -1880 -> 885
    //   2768: iconst_0
    //   2769: istore 11
    //   2771: aload 7
    //   2773: invokeinterface 767 1 0
    //   2778: ifle +222 -> 3000
    //   2781: aload_2
    //   2782: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   2785: istore 10
    //   2787: aload 6
    //   2789: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   2792: astore_3
    //   2793: iconst_m1
    //   2794: istore 11
    //   2796: iload 10
    //   2798: tableswitch	default:+74 -> 2872, 1:+255->3053, 2:+271->3069, 3:+239->3037, 4:+223->3021, 5:+231->3029, 6:+247->3045, 7:+263->3061, 8:+279->3077, 9:+74->2872, 10:+74->2872, 11:+74->2872, 12:+74->2872, 13:+74->2872, 14:+74->2872, 15:+231->3029
    //   2873: iconst_0
    //   2874: nop
    //   2875: istore 11
    //   2877: invokestatic 507	com/tencent/mm/plugin/sns/model/af:cnC	()Lcom/tencent/mm/plugin/sns/model/g;
    //   2880: aload 7
    //   2882: iconst_0
    //   2883: invokeinterface 771 2 0
    //   2888: checkcast 773	com/tencent/mm/protocal/protobuf/bau
    //   2891: aload 6
    //   2893: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   2896: iload 11
    //   2898: aload_0
    //   2899: getfield 30	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a:rub	Lcom/tencent/mm/plugin/sns/ui/SnsMsgUI;
    //   2902: invokevirtual 776	java/lang/Object:hashCode	()I
    //   2905: getstatic 782	com/tencent/mm/storage/az:xYS	Lcom/tencent/mm/storage/az;
    //   2908: invokevirtual 785	com/tencent/mm/plugin/sns/model/g:a	(Lcom/tencent/mm/protocal/protobuf/bau;Landroid/view/View;IILcom/tencent/mm/storage/az;)V
    //   2911: aload_2
    //   2912: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   2915: bipush 15
    //   2917: if_icmpeq +41 -> 2958
    //   2920: aload_2
    //   2921: getfield 432	com/tencent/mm/plugin/sns/storage/n:field_type	I
    //   2924: bipush 27
    //   2926: if_icmpne +159 -> 3085
    //   2929: aload 7
    //   2931: invokeinterface 767 1 0
    //   2936: ifle +149 -> 3085
    //   2939: aload 7
    //   2941: iconst_0
    //   2942: invokeinterface 771 2 0
    //   2947: checkcast 773	com/tencent/mm/protocal/protobuf/bau
    //   2950: getfield 786	com/tencent/mm/protocal/protobuf/bau:jCt	I
    //   2953: bipush 6
    //   2955: if_icmpne +130 -> 3085
    //   2958: aload 6
    //   2960: getfield 267	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rum	Landroid/widget/ImageView;
    //   2963: iconst_0
    //   2964: invokevirtual 499	android/widget/ImageView:setVisibility	(I)V
    //   2967: new 109	com/tencent/mm/plugin/sns/storage/j
    //   2970: astore_2
    //   2971: aload_2
    //   2972: invokespecial 110	com/tencent/mm/plugin/sns/storage/j:<init>	()V
    //   2975: invokestatic 70	com/tencent/mm/plugin/sns/model/af:cnK	()Lcom/tencent/mm/plugin/sns/storage/k;
    //   2978: aload 4
    //   2980: getfield 789	com/tencent/mm/plugin/sns/storage/j:xDa	J
    //   2983: aload_2
    //   2984: invokevirtual 792	com/tencent/mm/plugin/sns/storage/k:b	(JLcom/tencent/mm/sdk/e/c;)Z
    //   2987: pop
    //   2988: aload 6
    //   2990: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   2993: aload_2
    //   2994: invokevirtual 296	com/tencent/mm/ui/MMImageView:setTag	(Ljava/lang/Object;)V
    //   2997: iconst_1
    //   2998: istore 11
    //   3000: aload 6
    //   3002: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   3005: astore_2
    //   3006: iload 11
    //   3008: ifeq +143 -> 3151
    //   3011: iconst_0
    //   3012: istore_1
    //   3013: aload_2
    //   3014: iload_1
    //   3015: invokevirtual 497	com/tencent/mm/ui/MMImageView:setVisibility	(I)V
    //   3018: goto -1989 -> 1029
    //   3021: ldc_w 793
    //   3024: istore 11
    //   3026: goto -149 -> 2877
    //   3029: ldc_w 794
    //   3032: istore 11
    //   3034: goto -157 -> 2877
    //   3037: ldc_w 768
    //   3040: istore 11
    //   3042: goto -165 -> 2877
    //   3045: ldc_w 795
    //   3048: istore 11
    //   3050: goto -173 -> 2877
    //   3053: ldc_w 796
    //   3056: istore 11
    //   3058: goto -181 -> 2877
    //   3061: ldc_w 796
    //   3064: istore 11
    //   3066: goto -189 -> 2877
    //   3069: aload_3
    //   3070: aconst_null
    //   3071: invokevirtual 799	com/tencent/mm/ui/MMImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   3074: goto -197 -> 2877
    //   3077: aload_3
    //   3078: aconst_null
    //   3079: invokevirtual 799	com/tencent/mm/ui/MMImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   3082: goto -205 -> 2877
    //   3085: new 801	com/tencent/mm/plugin/sns/ui/ao
    //   3088: astore_3
    //   3089: aload_3
    //   3090: invokespecial 802	com/tencent/mm/plugin/sns/ui/ao:<init>	()V
    //   3093: aload_3
    //   3094: aload_2
    //   3095: invokevirtual 805	com/tencent/mm/plugin/sns/storage/n:cqU	()Ljava/lang/String;
    //   3098: putfield 808	com/tencent/mm/plugin/sns/ui/ao:czD	Ljava/lang/String;
    //   3101: aload_3
    //   3102: iconst_0
    //   3103: putfield 811	com/tencent/mm/plugin/sns/ui/ao:index	I
    //   3106: new 813	java/util/ArrayList
    //   3109: astore_2
    //   3110: aload_2
    //   3111: invokespecial 814	java/util/ArrayList:<init>	()V
    //   3114: aload_2
    //   3115: aload 6
    //   3117: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   3120: invokeinterface 817 2 0
    //   3125: pop
    //   3126: aload_3
    //   3127: aload_2
    //   3128: putfield 821	com/tencent/mm/plugin/sns/ui/ao:rsl	Ljava/util/List;
    //   3131: aload_3
    //   3132: iload_1
    //   3133: putfield 824	com/tencent/mm/plugin/sns/ui/ao:position	I
    //   3136: aload 6
    //   3138: getfield 241	com/tencent/mm/plugin/sns/ui/SnsMsgUI$a$a:rul	Lcom/tencent/mm/ui/MMImageView;
    //   3141: aload_3
    //   3142: invokevirtual 296	com/tencent/mm/ui/MMImageView:setTag	(Ljava/lang/Object;)V
    //   3145: iconst_1
    //   3146: istore 11
    //   3148: goto -148 -> 3000
    //   3151: bipush 8
    //   3153: istore_1
    //   3154: goto -141 -> 3013
    //   3157: aload 7
    //   3159: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   3162: bipush 7
    //   3164: if_icmpeq -2135 -> 1029
    //   3167: aload 7
    //   3169: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   3172: bipush 8
    //   3174: if_icmpeq -2145 -> 1029
    //   3177: aload 7
    //   3179: getfield 478	com/tencent/mm/protocal/protobuf/can:jCt	I
    //   3182: bipush 16
    //   3184: if_icmpne +85 -> 3269
    //   3187: aload 4
    //   3189: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   3192: invokestatic 830	com/tencent/mm/plugin/sns/model/m:kc	(J)Z
    //   3195: ifeq -2166 -> 1029
    //   3198: aload 7
    //   3200: getfield 834	com/tencent/mm/protocal/protobuf/can:vFa	Lcom/tencent/mm/protocal/protobuf/brf;
    //   3203: ifnull +29 -> 3232
    //   3206: ldc 112
    //   3208: ldc_w 836
    //   3211: iconst_1
    //   3212: anewarray 553	java/lang/Object
    //   3215: dup
    //   3216: iconst_0
    //   3217: aload 7
    //   3219: getfield 834	com/tencent/mm/protocal/protobuf/can:vFa	Lcom/tencent/mm/protocal/protobuf/brf;
    //   3222: getfield 841	com/tencent/mm/protocal/protobuf/brf:wTz	I
    //   3225: invokestatic 308	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3228: aastore
    //   3229: invokestatic 844	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3232: new 826	com/tencent/mm/plugin/sns/model/m
    //   3235: astore_2
    //   3236: aload_2
    //   3237: aload 4
    //   3239: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   3242: aload 7
    //   3244: getfield 834	com/tencent/mm/protocal/protobuf/can:vFa	Lcom/tencent/mm/protocal/protobuf/brf;
    //   3247: invokespecial 847	com/tencent/mm/plugin/sns/model/m:<init>	(JLcom/tencent/mm/protocal/protobuf/brf;)V
    //   3250: invokestatic 371	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   3253: pop
    //   3254: invokestatic 851	com/tencent/mm/kernel/g:RO	()Lcom/tencent/mm/kernel/b;
    //   3257: getfield 857	com/tencent/mm/kernel/b:eJo	Lcom/tencent/mm/ai/p;
    //   3260: aload_2
    //   3261: iconst_0
    //   3262: invokevirtual 862	com/tencent/mm/ai/p:a	(Lcom/tencent/mm/ai/m;I)Z
    //   3265: pop
    //   3266: goto -2237 -> 1029
    //   3269: aload 4
    //   3271: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   3274: invokestatic 867	com/tencent/mm/plugin/sns/model/q:kf	(J)Z
    //   3277: ifeq -2248 -> 1029
    //   3280: invokestatic 371	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   3283: pop
    //   3284: invokestatic 851	com/tencent/mm/kernel/g:RO	()Lcom/tencent/mm/kernel/b;
    //   3287: getfield 857	com/tencent/mm/kernel/b:eJo	Lcom/tencent/mm/ai/p;
    //   3290: astore_3
    //   3291: new 864	com/tencent/mm/plugin/sns/model/q
    //   3294: astore_2
    //   3295: aload_2
    //   3296: aload 4
    //   3298: getfield 167	com/tencent/mm/plugin/sns/storage/j:field_snsID	J
    //   3301: invokespecial 870	com/tencent/mm/plugin/sns/model/q:<init>	(J)V
    //   3304: aload_3
    //   3305: aload_2
    //   3306: iconst_0
    //   3307: invokevirtual 862	com/tencent/mm/ai/p:a	(Lcom/tencent/mm/ai/m;I)Z
    //   3310: pop
    //   3311: goto -2282 -> 1029
    //   3314: iconst_0
    //   3315: istore_1
    //   3316: goto -2263 -> 1053
    //   3319: bipush 8
    //   3321: istore_1
    //   3322: goto -2254 -> 1068
    //   3325: bipush 8
    //   3327: istore_1
    //   3328: goto -2235 -> 1093
    //   3331: astore_2
    //   3332: aload_3
    //   3333: astore_2
    //   3334: goto -2162 -> 1172
    //
    // Exception table:
    //   from	to	target	type
    //   358	382	1167	java/lang/Exception
    //   336	358	1189	java/lang/Exception
    //   403	489	1189	java/lang/Exception
    //   489	515	1189	java/lang/Exception
    //   515	533	1189	java/lang/Exception
    //   537	542	1189	java/lang/Exception
    //   542	578	1189	java/lang/Exception
    //   582	612	1189	java/lang/Exception
    //   612	716	1189	java/lang/Exception
    //   724	738	1189	java/lang/Exception
    //   738	747	1189	java/lang/Exception
    //   747	764	1189	java/lang/Exception
    //   772	807	1189	java/lang/Exception
    //   807	832	1189	java/lang/Exception
    //   834	864	1189	java/lang/Exception
    //   864	876	1189	java/lang/Exception
    //   880	885	1189	java/lang/Exception
    //   885	936	1189	java/lang/Exception
    //   940	1029	1189	java/lang/Exception
    //   1177	1186	1189	java/lang/Exception
    //   1206	1214	1189	java/lang/Exception
    //   1217	1234	1189	java/lang/Exception
    //   1237	1243	1189	java/lang/Exception
    //   1246	1267	1189	java/lang/Exception
    //   1364	1375	1189	java/lang/Exception
    //   1375	1384	1189	java/lang/Exception
    //   1387	1398	1189	java/lang/Exception
    //   1401	1412	1189	java/lang/Exception
    //   1415	1426	1189	java/lang/Exception
    //   1429	1440	1189	java/lang/Exception
    //   1449	1580	1189	java/lang/Exception
    //   1583	1595	1189	java/lang/Exception
    //   1599	1623	1189	java/lang/Exception
    //   1626	1637	1189	java/lang/Exception
    //   1641	1670	1189	java/lang/Exception
    //   1670	1743	1189	java/lang/Exception
    //   1746	1750	1189	java/lang/Exception
    //   1753	1760	1189	java/lang/Exception
    //   1764	1789	1189	java/lang/Exception
    //   1794	1845	1189	java/lang/Exception
    //   1845	1891	1189	java/lang/Exception
    //   1894	1920	1189	java/lang/Exception
    //   1923	1962	1189	java/lang/Exception
    //   1969	2004	1189	java/lang/Exception
    //   2009	2060	1189	java/lang/Exception
    //   2060	2106	1189	java/lang/Exception
    //   2109	2135	1189	java/lang/Exception
    //   2138	2153	1189	java/lang/Exception
    //   2156	2252	1189	java/lang/Exception
    //   2255	2291	1189	java/lang/Exception
    //   2331	2390	1189	java/lang/Exception
    //   2395	2423	1189	java/lang/Exception
    //   2426	2464	1189	java/lang/Exception
    //   2506	2524	1189	java/lang/Exception
    //   2526	2563	1189	java/lang/Exception
    //   2567	2631	1189	java/lang/Exception
    //   2631	2637	1189	java/lang/Exception
    //   2641	2668	1189	java/lang/Exception
    //   2671	2750	1189	java/lang/Exception
    //   2753	2765	1189	java/lang/Exception
    //   2771	2793	1189	java/lang/Exception
    //   2877	2958	1189	java/lang/Exception
    //   2958	2997	1189	java/lang/Exception
    //   3000	3006	1189	java/lang/Exception
    //   3013	3018	1189	java/lang/Exception
    //   3069	3074	1189	java/lang/Exception
    //   3077	3082	1189	java/lang/Exception
    //   3085	3145	1189	java/lang/Exception
    //   3157	3232	1189	java/lang/Exception
    //   3232	3266	1189	java/lang/Exception
    //   3269	3311	1189	java/lang/Exception
    //   2291	2331	2393	java/lang/Exception
    //   2464	2506	2640	java/lang/Exception
    //   382	399	3331	java/lang/Exception
    //   1121	1136	3331	java/lang/Exception
    //   1145	1162	3331	java/lang/Exception
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.a
 * JD-Core Version:    0.6.2
 */