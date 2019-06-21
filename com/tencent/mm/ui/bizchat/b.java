package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.tools.r;
import java.util.HashMap;

public final class b extends p<com.tencent.mm.aj.a.a>
  implements n.b
{
  private com.tencent.mm.at.a.a.c elH;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.f jJQ;
  protected MMSlideDelView.d jJR;
  private final String jMp;
  private final MMFragmentActivity yDT;
  private float yDU;
  private float yDV;
  private float yDW;
  private ColorStateList[] yDX;
  HashMap<String, a> yDY;

  public b(Context paramContext, p.a parama, String paramString)
  {
    super(paramContext, new com.tencent.mm.aj.a.a());
    AppMethodBeat.i(30044);
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.yDU = -1.0F;
    this.yDV = -1.0F;
    this.yDW = -1.0F;
    this.yDX = new ColorStateList[5];
    this.elH = null;
    super.a(parama);
    this.yDT = ((MMFragmentActivity)paramContext);
    this.jMp = paramString;
    this.yDY = new HashMap();
    this.yDX[0] = com.tencent.mm.bz.a.h(paramContext, 2131690164);
    this.yDX[1] = com.tencent.mm.bz.a.h(paramContext, 2131690755);
    this.yDX[3] = com.tencent.mm.bz.a.h(paramContext, 2131690316);
    this.yDX[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.yDX[2] = com.tencent.mm.bz.a.h(paramContext, 2131690752);
    this.yDX[4] = com.tencent.mm.bz.a.h(paramContext, 2131690204);
    this.yDU = com.tencent.mm.bz.a.al(paramContext, 2131427813);
    this.yDV = com.tencent.mm.bz.a.al(paramContext, 2131427762);
    this.yDW = com.tencent.mm.bz.a.al(paramContext, 2131427866);
    paramContext = new c.a();
    paramContext.ePK = e.cC(this.jMp);
    paramContext.ePH = true;
    paramContext.ePZ = true;
    paramContext.ePT = 2131231172;
    this.elH = paramContext.ahG();
    AppMethodBeat.o(30044);
  }

  private static int FB(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(30050);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (paramString.length() <= 0);
    }
    try
    {
      j = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(30050);
      return j;
    }
    catch (NumberFormatException paramString)
    {
      while (true)
        j = i;
    }
  }

  private CharSequence a(com.tencent.mm.aj.a.a parama, int paramInt, String paramString)
  {
    AppMethodBeat.i(30049);
    if ((!bo.isNullOrNil(parama.field_editingMsg)) && ((parama.field_atCount <= 0) || (parama.field_unReadCount <= 0)))
    {
      paramString = new SpannableStringBuilder(this.yDT.getString(2131301279));
      paramString.setSpan(new ForegroundColorSpan(-5569532), 0, paramString.length(), 33);
      paramString.append(" ").append(com.tencent.mm.pluginsdk.ui.e.j.b(this.yDT, parama.field_editingMsg, paramInt));
      AppMethodBeat.o(30049);
      parama = paramString;
    }
    while (true)
    {
      return parama;
      Object localObject;
      String str1;
      if ((parama.field_msgType != null) && ((parama.field_msgType.equals("47")) || (parama.field_msgType.equals("1048625"))))
      {
        localObject = aqV(parama.field_digest);
        str1 = "";
        if (localObject != null)
        {
          parama = "[" + (String)localObject + "]";
          AppMethodBeat.o(30049);
        }
        else
        {
          localObject = str1;
          if (parama.field_digest != null)
          {
            localObject = str1;
            if (parama.field_digest.contains(":"))
            {
              str1 = parama.field_digest.substring(0, parama.field_digest.indexOf(":"));
              String str2 = aqV(parama.field_digest.substring(parama.field_digest.indexOf(":") + 1).replace(" ", ""));
              localObject = str1;
              if (str2 != null)
              {
                parama = "[" + str2 + "]";
                if (bo.isNullOrNil(str1))
                {
                  AppMethodBeat.o(30049);
                  continue;
                }
                parama = str1 + ": " + parama;
                AppMethodBeat.o(30049);
              }
            }
          }
          else
          {
            str1 = this.yDT.getString(2131296895);
            if (bo.isNullOrNil((String)localObject))
            {
              localObject = str1;
              parama.field_digest = ((String)localObject);
            }
          }
        }
      }
      else
      {
        if (!bo.isNullOrNil(parama.field_digest))
          if (bo.isNullOrNil(parama.field_digestUser));
        while (true)
        {
          try
          {
            paramString = String.format(parama.field_digest, new Object[] { paramString });
            paramString = paramString.replace('\n', ' ');
            if ((parama.field_atCount <= 0) || (parama.field_unReadCount <= 0))
              break label549;
            parama = new SpannableStringBuilder(this.yDT.getString(2131301275));
            parama.setSpan(new ForegroundColorSpan(-5569532), 0, parama.length(), 33);
            parama.append(" ").append(com.tencent.mm.pluginsdk.ui.e.j.b(this.yDT, paramString, paramInt));
            AppMethodBeat.o(30049);
            break;
            localObject = (String)localObject + ": " + str1;
          }
          catch (Exception paramString)
          {
            paramString = parama.field_digest;
            continue;
          }
          paramString = parama.field_digest;
          continue;
          paramString = "";
        }
        label549: parama = com.tencent.mm.pluginsdk.ui.e.j.b(this.yDT, paramString, paramInt);
        AppMethodBeat.o(30049);
      }
    }
  }

  private static String aqV(String paramString)
  {
    AppMethodBeat.i(30048);
    if ((paramString != null) && (paramString.length() == 32))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jh(paramString);
      AppMethodBeat.o(30048);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(30048);
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(30045);
    bIf();
    setCursor(z.aeU().rn(this.jMp));
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(30045);
  }

  public final void KD()
  {
    AppMethodBeat.i(30051);
    KC();
    AppMethodBeat.o(30051);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(30052);
    super.a(paramInt, paramn, paramObject);
    AppMethodBeat.o(30052);
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.jJQ = paramf;
  }

  public final int getItemViewType(int paramInt)
  {
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30047);
    Object localObject1 = (com.tencent.mm.aj.a.a)getItem(paramInt);
    if (paramView != null);
    for (paramViewGroup = (b.b)paramView.getTag(); ; paramViewGroup = null)
    {
      if ((paramView == null) || (paramViewGroup == null))
      {
        paramViewGroup = new b.b();
        if (com.tencent.mm.bz.a.ga(this.yDT))
        {
          paramView = View.inflate(this.yDT, 2130969242, null);
          paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
          paramViewGroup.yEc = ((NoMeasuredTextView)paramView.findViewById(2131823149));
          paramViewGroup.yEd = ((NoMeasuredTextView)paramView.findViewById(2131823150));
          paramViewGroup.yEe = ((NoMeasuredTextView)paramView.findViewById(2131823151));
          paramViewGroup.jJV = ((TextView)paramView.findViewById(2131821067));
          paramViewGroup.jJV.setBackgroundResource(r.ik(this.yDT));
          paramViewGroup.yEf = ((ImageView)paramView.findViewById(2131823153));
          paramViewGroup.yEh = paramView.findViewById(2131823148);
          paramViewGroup.yEg = ((ImageView)paramView.findViewById(2131823154));
          paramView.setTag(paramViewGroup);
          paramViewGroup.yEe.setTextSize(0, this.yDV);
          paramViewGroup.yEd.setTextSize(0, this.yDW);
          paramViewGroup.yEc.setTextSize(0, this.yDU);
          paramViewGroup.yEe.setTextColor(this.yDX[0]);
          paramViewGroup.yEd.setTextColor(this.yDX[4]);
          paramViewGroup.yEc.setTextColor(this.yDX[3]);
          paramViewGroup.yEe.setShouldEllipsize(true);
          paramViewGroup.yEd.setShouldEllipsize(false);
          paramViewGroup.yEc.setShouldEllipsize(true);
          paramViewGroup.yEd.setGravity(5);
        }
      }
      while (true)
      {
        long l = ((com.tencent.mm.aj.a.a)localObject1).field_bizChatId;
        Object localObject2 = (a)this.yDY.get(String.valueOf(l));
        Object localObject3 = localObject2;
        if (localObject2 == null)
        {
          localObject3 = new a((byte)0);
          z.aeU();
          ((a)localObject3).yDZ = com.tencent.mm.aj.a.b.c((com.tencent.mm.aj.a.a)localObject1);
          localObject2 = z.aeT().aK(l);
          if (((com.tencent.mm.aj.a.c)localObject2).isGroup())
          {
            ((a)localObject3).egE = ((com.tencent.mm.aj.a.c)localObject2).field_chatName;
            ((a)localObject3).eif = ((com.tencent.mm.aj.a.c)localObject2).lc(1);
            ((a)localObject3).myX = ((com.tencent.mm.aj.a.c)localObject2).field_headImageUrl;
            label408: if (bo.isNullOrNil(((a)localObject3).egE))
              ((a)localObject3).egE = this.yDT.getString(2131302552);
            ((a)localObject3).yEa = ((com.tencent.mm.aj.a.a)localObject1);
            this.yDY.put(String.valueOf(l), localObject3);
          }
        }
        else
        {
          paramViewGroup.yEg.setVisibility(8);
          localObject1 = paramViewGroup.yEd;
          if (((a)localObject3).yEa.field_status != 1)
            break label902;
          localObject2 = this.yDT.getString(2131301306);
          label495: ((NoMeasuredTextView)localObject1).setText((CharSequence)localObject2);
          o.ahp().a(((a)localObject3).myX, paramViewGroup.ejo, this.elH);
          if (!((a)localObject3).eif)
            break label923;
          paramViewGroup.yEf.setVisibility(0);
          label537: paramViewGroup.yEc.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.yDT, ((a)localObject3).egE, (int)paramViewGroup.yEc.getTextSize()));
          localObject2 = a(((a)localObject3).yEa, (int)paramViewGroup.yEe.getTextSize(), ((a)localObject3).egE);
          switch (((a)localObject3).yEa.field_status)
          {
          case 3:
          case 4:
          default:
            paramInt = -1;
            label638: paramViewGroup.yEc.setDrawRightDrawable(false);
            if (paramInt != -1)
            {
              paramViewGroup.yEe.setCompoundLeftDrawablesWithIntrinsicBounds(paramInt);
              paramViewGroup.yEe.setDrawLeftDrawable(true);
              label667: paramViewGroup.yEe.setText((CharSequence)localObject2);
              paramViewGroup.yEe.setTextColor(com.tencent.mm.bz.a.h(this.yDT, 2131690754));
              if ((FB(((a)localObject3).yEa.field_msgType) == 34) && (((a)localObject3).yEa.field_isSend == 0) && (!bo.isNullOrNil(((a)localObject3).yEa.field_content)) && (!new com.tencent.mm.modelvoice.n(((a)localObject3).yEa.field_content).fWX))
                paramViewGroup.yEe.setTextColor(com.tencent.mm.bz.a.h(this.yDT, 2131690755));
              if (!((a)localObject3).eif)
                break label981;
              if (((a)localObject3).yEa.field_unReadCount <= 0)
                break label970;
              paramViewGroup.yEh.setVisibility(0);
              label798: paramViewGroup.jJV.setVisibility(4);
              label806: if (!((a)localObject3).yDZ)
                break label1134;
              paramView.findViewById(2131823147).setBackgroundResource(2130838395);
            }
            break;
          case 0:
          case 1:
          case 2:
          case 5:
          }
        }
        while (true)
        {
          AppMethodBeat.o(30047);
          return paramView;
          paramView = View.inflate(this.yDT, 2130969241, null);
          break;
          localObject2 = z.aeV().cH(((com.tencent.mm.aj.a.c)localObject2).field_bizChatServId);
          if (localObject2 == null)
            break label408;
          ((a)localObject3).egE = ((com.tencent.mm.aj.a.j)localObject2).field_userName;
          ((a)localObject3).eif = ((com.tencent.mm.aj.a.j)localObject2).lc(1);
          ((a)localObject3).myX = ((com.tencent.mm.aj.a.j)localObject2).field_headImageUrl;
          break label408;
          label902: localObject2 = h.c(this.yDT, ((a)localObject3).yEa.field_lastMsgTime, true);
          break label495;
          label923: paramViewGroup.yEf.setVisibility(8);
          break label537;
          paramInt = -1;
          break label638;
          paramInt = 2131231663;
          break label638;
          paramInt = -1;
          break label638;
          paramInt = 2131231662;
          break label638;
          paramViewGroup.yEe.setDrawLeftDrawable(false);
          break label667;
          label970: paramViewGroup.yEh.setVisibility(4);
          break label798;
          label981: paramViewGroup.yEh.setVisibility(4);
          if (((a)localObject3).yEa.field_unReadCount > 99)
          {
            paramViewGroup.jJV.setText("");
            paramViewGroup.jJV.setBackgroundResource(2131230952);
            paramViewGroup.jJV.setVisibility(0);
            ab.v("MicroMsg.BizChatConversationAdapter", "has unread 100");
            break label806;
          }
          if (((a)localObject3).yEa.field_unReadCount > 0)
          {
            paramViewGroup.jJV.setText(((a)localObject3).yEa.field_unReadCount);
            paramViewGroup.jJV.setVisibility(0);
            paramViewGroup.jJV.setBackgroundResource(r.ik(this.yDT));
            ab.v("MicroMsg.BizChatConversationAdapter", "has unread");
            break label806;
          }
          paramViewGroup.jJV.setVisibility(4);
          ab.v("MicroMsg.BizChatConversationAdapter", "no unread");
          break label806;
          label1134: paramView.findViewById(2131823147).setBackgroundResource(2130838396);
        }
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 1;
  }

  public final void mY(long paramLong)
  {
    AppMethodBeat.i(30053);
    if (this.yDY != null)
      this.yDY.remove(String.valueOf(paramLong));
    AppMethodBeat.o(30053);
  }

  public final void onPause()
  {
    AppMethodBeat.i(30046);
    if (this.jJR != null)
      this.jJR.bIp();
    AppMethodBeat.o(30046);
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }

  final class a
  {
    String egE = null;
    public boolean eif;
    String myX = null;
    public boolean yDZ;
    public com.tencent.mm.aj.a.a yEa;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.b
 * JD-Core Version:    0.6.2
 */