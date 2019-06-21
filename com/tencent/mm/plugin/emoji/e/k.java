package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.f.o;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.m;
import com.tencent.mm.storage.emotion.n;
import java.util.HashMap;

public final class k
{
  public int emW;
  public boolean kUC;
  public long kUD;
  public int kUE;
  public m kUF;
  public HashMap<String, m> kUG;

  public k()
  {
    AppMethodBeat.i(52977);
    this.kUC = true;
    this.kUD = 863913600000L;
    this.kUE = 19;
    this.emW = 79;
    this.kUG = new HashMap();
    AppMethodBeat.o(52977);
  }

  private void a(m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(52980);
    if (paramm == null)
    {
      ab.w("MicroMsg.emoji.EmojiRewardTipMgr", "updateLastRewardTipInfo failed. reward tip info is null.");
      AppMethodBeat.o(52980);
      return;
    }
    if ((this.kUF == null) || (this.kUF.field_prodcutID.equalsIgnoreCase(paramm.field_prodcutID)));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        this.kUF.field_continuCount = 0;
        this.kUG.put(this.kUF.field_prodcutID, this.kUF);
        j.getEmojiStorageMgr().xYu.a(this.kUF);
      }
      this.kUF = paramm;
      if (!paramBoolean)
        break label182;
      this.kUF.field_modifyTime = 0L;
      this.kUF.field_showTipsTime = System.currentTimeMillis();
      this.kUF.field_totalCount = 0;
      this.kUF.field_continuCount = 0;
      this.kUG.put(this.kUF.field_prodcutID, this.kUF);
      j.getEmojiStorageMgr().xYu.a(this.kUF);
      AppMethodBeat.o(52980);
      break;
    }
    label182: if (i != 0);
    for (this.kUF.field_continuCount += 1; ; this.kUF.field_continuCount = 1)
    {
      this.kUF.field_totalCount += 1;
      this.kUF.field_modifyTime = System.currentTimeMillis();
      break;
    }
  }

  public final boolean Js(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(52979);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip product id is null.");
      AppMethodBeat.o(52979);
    }
    while (true)
    {
      return bool;
      if ((!this.kUC) && (!r.YI()))
      {
        ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip reward tip is disable. mRewardTipEnable:%b isOpenForWallet:%b", new Object[] { Boolean.valueOf(this.kUC), Boolean.valueOf(r.YI()) });
        AppMethodBeat.o(52979);
      }
      else
      {
        Object localObject;
        if ((this.kUG != null) && (this.kUG.containsKey(paramString)))
          localObject = (m)this.kUG.get(paramString);
        while (true)
        {
          if (System.currentTimeMillis() - ((m)localObject).field_showTipsTime >= this.kUD)
            break label160;
          ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip in cool down time.");
          bkc();
          AppMethodBeat.o(52979);
          break;
          localObject = new m();
          ((m)localObject).field_prodcutID = paramString;
        }
        label160: if ((localObject != null) && (System.currentTimeMillis() - ((m)localObject).field_setFlagTime > 86400000L))
          if ((this.kUF != null) && (paramString.equalsIgnoreCase(this.kUF.field_prodcutID)) && (this.kUF.field_continuCount >= this.kUE - 1) && (this.kUF.field_continuCount <= this.kUE + 5 - 1))
            g.RO().eJo.a(new o(paramString, o.kWY), 0);
        int i;
        label468: int j;
        while (true)
          if ((this.kUF != null) && (paramString.equalsIgnoreCase(this.kUF.field_prodcutID)) && (this.kUF.field_continuCount >= this.kUE))
          {
            if (((this.kUF.field_flag & o.kWZ) == o.kWZ) && ((this.kUF.field_flag & o.kXa) != o.kXa))
            {
              ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  continue count:%d", new Object[] { Boolean.TRUE, paramString, Integer.valueOf(this.kUF.field_continuCount) });
              a((m)localObject, true);
              h.pYm.e(12953, new Object[] { Integer.valueOf(0), this.kUF.field_prodcutID });
              AppMethodBeat.o(52979);
              bool = true;
              break;
              if ((((m)localObject).field_totalCount < this.emW - 1) || (((m)localObject).field_totalCount > this.emW + 5 - 1))
                continue;
              g.RO().eJo.a(new o(paramString, o.kWY), 0);
              continue;
              if (this.kUF == null)
              {
                i = 0;
                if (this.kUF != null)
                  break label520;
              }
              label520: for (j = 0; ; j = this.kUF.field_totalCount)
              {
                ab.d("MicroMsg.emoji.EmojiRewardTipMgr", "no need to get reward today. continue count:%d total count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                break;
                i = this.kUF.field_continuCount;
                break label468;
              }
            }
            ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  continue count:%d flag:%d", new Object[] { Boolean.FALSE, paramString, Integer.valueOf(this.kUF.field_continuCount), Integer.valueOf(this.kUF.field_flag) });
            a((m)localObject, false);
            AppMethodBeat.o(52979);
            break;
          }
        if ((localObject != null) && (((m)localObject).field_totalCount >= this.emW))
        {
          if (((((m)localObject).field_flag & o.kWZ) == o.kWZ) && ((((m)localObject).field_flag & o.kXa) != o.kXa))
          {
            localBoolean = Boolean.TRUE;
            if (this.kUF == null)
            {
              i = 0;
              label651: ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  total count :%d", new Object[] { localBoolean, paramString, Integer.valueOf(i) });
              a((m)localObject, true);
              localObject = h.pYm;
              if (this.kUF != null)
                break label743;
            }
            label743: for (paramString = ""; ; paramString = this.kUF.field_prodcutID)
            {
              ((h)localObject).e(12953, new Object[] { Integer.valueOf(0), paramString });
              AppMethodBeat.o(52979);
              bool = true;
              break;
              i = this.kUF.field_totalCount;
              break label651;
            }
          }
          Boolean localBoolean = Boolean.FALSE;
          if (this.kUF == null)
          {
            i = 0;
            label769: if (this.kUF != null)
              break label841;
          }
          label841: for (j = 0; ; j = this.kUF.field_flag)
          {
            ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  total count :%d flag:%d", new Object[] { localBoolean, paramString, Integer.valueOf(i), Integer.valueOf(j) });
            a((m)localObject, false);
            AppMethodBeat.o(52979);
            break;
            i = this.kUF.field_totalCount;
            break label769;
          }
        }
        a((m)localObject, false);
        AppMethodBeat.o(52979);
      }
    }
  }

  public final void bkc()
  {
    AppMethodBeat.i(52978);
    if (this.kUF != null)
    {
      this.kUF.field_continuCount = 0;
      this.kUG.put(this.kUF.field_prodcutID, this.kUF);
      j.getEmojiStorageMgr().xYu.a(this.kUF);
      this.kUF = null;
    }
    AppMethodBeat.o(52978);
  }

  public final void ca(String paramString, int paramInt)
  {
    AppMethodBeat.i(52981);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.emoji.EmojiRewardTipMgr", "updateProductFlag failed. no such product id.");
      AppMethodBeat.o(52981);
    }
    while (true)
    {
      return;
      if ((this.kUG != null) && (this.kUG.containsKey(paramString)))
      {
        ((m)this.kUG.get(paramString)).field_flag = paramInt;
        ((m)this.kUG.get(paramString)).field_setFlagTime = System.currentTimeMillis();
        AppMethodBeat.o(52981);
      }
      else
      {
        ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "updateProductFlag map no contains this product id :%s", new Object[] { paramString });
        AppMethodBeat.o(52981);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.k
 * JD-Core Version:    0.6.2
 */