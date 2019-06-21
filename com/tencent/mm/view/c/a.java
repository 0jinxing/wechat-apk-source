package com.tencent.mm.view.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;

public final class a
{
  public com.tencent.mm.view.f.a Aaj;
  public com.tencent.mm.view.e.a Adi;
  public int Adj;
  public int Adk;
  public int Adl;
  public boolean Adm;
  public int Adn;
  private final String TAG;
  public int jis;
  public String kWz;
  public int tVA;
  public int tVB;

  public a(EmojiGroupInfo paramEmojiGroupInfo, int paramInt1, int paramInt2, com.tencent.mm.view.f.a parama, com.tencent.mm.view.e.a parama1, boolean paramBoolean)
  {
    AppMethodBeat.i(63015);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelInfo";
    this.Adm = false;
    if ((paramEmojiGroupInfo == null) || (bo.isNullOrNil(paramEmojiGroupInfo.field_productID)))
    {
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelInfo", "catch invalid Smiley Tab want add??!!");
      AppMethodBeat.o(63015);
      return;
    }
    this.Adi = parama1;
    this.Aaj = parama;
    this.kWz = paramEmojiGroupInfo.field_productID;
    this.jis = paramInt1;
    this.Adn = paramInt2;
    if ((paramBoolean) || (paramEmojiGroupInfo.field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.yac))))
    {
      parama = this.Aaj;
      if (paramEmojiGroupInfo != null)
        if (paramEmojiGroupInfo.field_productID.equals("TAG_DEFAULT_TAB"))
        {
          paramInt2 = com.tencent.mm.cb.e.dqK().aRt();
          parama.dNx();
          label133: this.Adj = paramInt2;
          parama = this.Aaj;
          paramEmojiGroupInfo = this.kWz;
          if ((parama.jiL > 0) && (!bo.isNullOrNil(paramEmojiGroupInfo)))
            break label553;
          paramInt2 = 1;
          label166: this.tVA = paramInt2;
          parama = this.Aaj;
          paramEmojiGroupInfo = this.kWz;
          if (!bo.isNullOrNil(paramEmojiGroupInfo))
            break label667;
          paramInt2 = 0;
          label191: this.tVB = paramInt2;
          this.Aaj.a(this);
        }
    }
    while (true)
    {
      this.Adm = paramBoolean;
      ab.i("MicroMsg.emoji.SmileyPanel.SmileyPanelInfo", "smiley panel tab: productId: %s, startIndex: %d mAllEmojiNums: %d mRow:%d mCol:%d mSpacing:%d ", new Object[] { this.kWz, Integer.valueOf(paramInt1), Integer.valueOf(this.Adj), Integer.valueOf(this.tVA), Integer.valueOf(this.tVB), Integer.valueOf(this.Adk) });
      AppMethodBeat.o(63015);
      break;
      if (paramEmojiGroupInfo.field_productID.equals(String.valueOf(EmojiGroupInfo.yad)))
      {
        if (com.tencent.mm.view.f.a.isSDCardAvailable())
        {
          paramInt2 = parama.dNn();
          break label133;
        }
        paramInt2 = 0;
        break label133;
      }
      if (paramEmojiGroupInfo.field_productID.equals("capture"))
      {
        if (parama.gOW == ChatFooterPanel.vhi);
        for (boolean bool = true; ; bool = false)
        {
          i = com.tencent.mm.emoji.a.a.OB().bZ(bool).size();
          paramInt2 = i;
          if (!com.tencent.mm.view.f.a.QL(parama.gOW))
            break;
          paramInt2 = i + 1;
          break;
        }
      }
      if (paramEmojiGroupInfo.field_productID.equalsIgnoreCase(String.valueOf(EmojiGroupInfo.yac)))
      {
        if (com.tencent.mm.view.f.a.isSDCardAvailable())
        {
          paramInt2 = 16;
          break label133;
        }
        paramInt2 = 0;
        break label133;
      }
      if (com.tencent.mm.view.f.a.e(paramEmojiGroupInfo))
      {
        paramInt2 = 1;
        if (paramEmojiGroupInfo != null)
        {
          if (paramEmojiGroupInfo.field_count <= 0)
            break label469;
          paramInt2 = paramEmojiGroupInfo.field_count;
        }
        while (true)
        {
          i = paramInt2;
          if (paramInt2 == 0)
            i = 1;
          paramInt2 = i;
          if (com.tencent.mm.view.f.a.isSDCardAvailable())
            break;
          paramInt2 = 0;
          break;
          label469: paramInt2 = ((d)g.M(d.class)).getProvider().Jp(paramEmojiGroupInfo.field_productID);
          paramEmojiGroupInfo.field_count = paramInt2;
          long l = System.currentTimeMillis();
          ((d)g.M(d.class)).getProvider().a(paramEmojiGroupInfo);
          ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        }
      }
      paramInt2 = 1;
      break label133;
      label553: if (paramEmojiGroupInfo.equals("TAG_STORE_TAB"))
      {
        paramInt2 = 1;
        break label166;
      }
      if (paramEmojiGroupInfo.equals("TAG_DEFAULT_TAB"))
      {
        i = (parama.jiL - parama.Ael) / parama.atj(paramEmojiGroupInfo);
        label596: if (!bo.isNullOrNil(paramEmojiGroupInfo))
          break label648;
        paramInt2 = 0;
      }
      while (true)
      {
        int j = i;
        if (i > paramInt2)
          j = paramInt2;
        paramInt2 = j;
        if (j > 0)
          break;
        paramInt2 = 1;
        break;
        i = parama.jiL / parama.atj(paramEmojiGroupInfo);
        break label596;
        label648: if (paramEmojiGroupInfo.equals("TAG_DEFAULT_TAB"))
          paramInt2 = 3;
        else
          paramInt2 = 2;
      }
      label667: if (paramEmojiGroupInfo.equals("TAG_DEFAULT_TAB"))
      {
        if (x.gu(parama.Gn))
        {
          paramInt2 = 7;
          break label191;
        }
        paramInt2 = parama.aRB() / parama.Aef;
        break label191;
      }
      if (parama.jiL <= 0)
      {
        paramInt2 = 0;
        break label191;
      }
      if (paramEmojiGroupInfo.equals("TAG_STORE_TAB"))
      {
        paramInt2 = 3;
        break label191;
      }
      int i = parama.aRB() / parama.Aec;
      paramInt2 = i;
      if (x.gu(parama.Gn))
      {
        paramInt2 = i;
        if (i > 4)
          paramInt2 = 4;
      }
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelStg", "return calc Col Nums: %d", new Object[] { Integer.valueOf(paramInt2) });
      break label191;
      this.Adj = 1;
      this.tVA = 1;
      this.tVB = 1;
      this.Aaj.a(this);
    }
  }

  private boolean dMV()
  {
    AppMethodBeat.i(63016);
    boolean bool = "TAG_DEFAULT_TAB".equals(this.kWz);
    AppMethodBeat.o(63016);
    return bool;
  }

  public final int aRz()
  {
    return this.tVA * this.tVB;
  }

  public final int dMW()
  {
    return this.tVA * this.tVB;
  }

  public final int dMX()
  {
    AppMethodBeat.i(63017);
    int i;
    if (aRz() <= 0)
    {
      i = 0;
      AppMethodBeat.o(63017);
    }
    while (true)
    {
      return i;
      if (dMV())
      {
        i = (int)Math.ceil(this.Adj / (aRz() - 1));
        if (this.Aaj.dNx())
        {
          i++;
          AppMethodBeat.o(63017);
        }
        else
        {
          AppMethodBeat.o(63017);
        }
      }
      else
      {
        i = (int)Math.ceil(this.Adj / aRz());
        AppMethodBeat.o(63017);
      }
    }
  }

  public final int getColumnWidth()
  {
    AppMethodBeat.i(63018);
    int i = this.Aaj.aRB() / (this.Aaj.aRB() / this.Aaj.Aec);
    AppMethodBeat.o(63018);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.c.a
 * JD-Core Version:    0.6.2
 */