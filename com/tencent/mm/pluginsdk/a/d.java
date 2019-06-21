package com.tencent.mm.pluginsdk.a;

import android.content.Context;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ba.f;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import com.tencent.mm.storage.emotion.r;
import java.util.ArrayList;
import java.util.List;

public abstract interface d extends e
{
  public abstract EmojiInfo Jd(String paramString);

  public abstract String Jf(String paramString);

  public abstract List<EmojiInfo> Jg(String paramString);

  public abstract boolean Ji(String paramString);

  public abstract ArrayList<String> Jj(String paramString);

  public abstract String Jk(String paramString);

  public abstract String Jl(String paramString);

  public abstract int Jm(String paramString);

  public abstract String Jn(String paramString);

  public abstract void Jo(String paramString);

  public abstract EmojiInfo a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3);

  public abstract String a(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString);

  public abstract void a(Context paramContext, bi parambi, String paramString);

  public abstract void a(String paramString, EmojiInfo paramEmojiInfo, bi parambi);

  public abstract boolean a(Context paramContext, EmojiInfo paramEmojiInfo, int paramInt, String paramString);

  public abstract boolean a(String paramString1, String paramString2, long paramLong, String paramString3, e.a parama);

  public abstract boolean bjN();

  public abstract ArrayList<r> bjP();

  public abstract f bjQ();

  public abstract boolean bjR();

  public abstract String bjS();

  public abstract boolean c(EmojiInfo paramEmojiInfo, boolean paramBoolean);

  public abstract int d(EmojiInfo paramEmojiInfo, boolean paramBoolean);

  public abstract as dK(String paramString1, String paramString2);

  public abstract String dL(String paramString1, String paramString2);

  public abstract byte[] l(EmojiInfo paramEmojiInfo);

  public abstract int o(EmojiInfo paramEmojiInfo);

  public abstract int[] p(EmojiInfo paramEmojiInfo);

  public abstract boolean r(Context paramContext, String paramString1, String paramString2);

  public abstract void updateEmojiInfo(EmojiInfo paramEmojiInfo);

  public abstract boolean w(ArrayList<SmileyInfo> paramArrayList);

  public abstract boolean x(ArrayList<r> paramArrayList);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.a.d
 * JD-Core Version:    0.6.2
 */