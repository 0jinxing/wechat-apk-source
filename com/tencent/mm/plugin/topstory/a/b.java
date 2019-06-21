package com.tencent.mm.plugin.topstory.a;

import com.tencent.mm.kernel.b.d;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.xweb.WebView.d;

public abstract interface b extends d
{
  public abstract e getRedDotMgr();

  public abstract f getReporter();

  public abstract WebView.d getWebViewType();

  public abstract void onVideoListUIDestroy(chv paramchv);

  public abstract void onVideoListUIPause();

  public abstract void onVideoListUIResume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.b
 * JD-Core Version:    0.6.2
 */