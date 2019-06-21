package com.tencent.mm.pluginsdk.a;

import com.tencent.mm.at.a.a;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureUploadManager.UploadTask;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import com.tencent.mm.storage.emotion.t;
import java.util.ArrayList;
import java.util.List;

public abstract interface e
{
  public abstract EmojiInfo Je(String paramString);

  public abstract String Jh(String paramString);

  public abstract int Jp(String paramString);

  public abstract boolean Jq(String paramString);

  public abstract void Jr(String paramString);

  public abstract ArrayList<EmojiInfo> OC();

  public abstract ArrayList<EmojiGroupInfo> OD();

  public abstract boolean OS();

  public abstract boolean OT();

  public abstract void a(EmojiCaptureUploadManager.UploadTask paramUploadTask);

  public abstract void a(cab paramcab);

  public abstract boolean a(EmojiGroupInfo paramEmojiGroupInfo);

  public abstract void b(EmojiCaptureUploadManager.UploadTask paramUploadTask);

  public abstract ArrayList<EmojiInfo> bY(boolean paramBoolean);

  public abstract void bZ(String paramString, int paramInt);

  public abstract ArrayList<SmileyInfo> bjO();

  public abstract void bjT();

  public abstract cab bjU();

  public abstract int bjV();

  public abstract a bjW();

  public abstract boolean bjX();

  public abstract List<t> bjY();

  public abstract void bjZ();

  public abstract boolean bka();

  public abstract <T> T c(ac.a parama, T paramT);

  public abstract void d(ac.a parama, Object paramObject);

  public abstract void g(k.a parama);

  public abstract String getAccPath();

  public abstract void h(k.a parama);

  public abstract void i(k.a parama);

  public abstract EmojiInfo j(String paramString, int paramInt1, int paramInt2, int paramInt3);

  public abstract void j(k.a parama);

  public abstract void k(k.a parama);

  public abstract ArrayList<EmojiInfo> kS(String paramString);

  public abstract void l(k.a parama);

  public abstract byte[] l(EmojiInfo paramEmojiInfo);

  public abstract EmojiInfo n(EmojiInfo paramEmojiInfo);

  public abstract void onDestroy();

  public abstract void q(EmojiInfo paramEmojiInfo);

  public abstract void r(EmojiInfo paramEmojiInfo);

  public abstract void updateEmojiInfo(EmojiInfo paramEmojiInfo);

  public abstract int y(boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.a.e
 * JD-Core Version:    0.6.2
 */