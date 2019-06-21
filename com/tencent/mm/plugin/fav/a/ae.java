package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.kernel.b.d;
import com.tencent.mm.protocal.protobuf.aax;
import com.tencent.mm.protocal.protobuf.abi;
import java.util.List;

public abstract interface ae extends d
{
  public abstract void checkFavItem(abi paramabi);

  public abstract void checkFavItem(List<aax> paramList);

  public abstract r getCheckCdnService();

  public abstract u getEditService();

  public abstract o getFavCdnService();

  public abstract q getFavCdnStorage();

  public abstract s getFavConfigStorage();

  public abstract t getFavEditInfoStorage();

  public abstract x getFavItemInfoStorage();

  public abstract aa getFavSearchStorage();

  public abstract l getFavTagSetMgr();

  public abstract z getModService();

  public abstract ac getSendService();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ae
 * JD-Core Version:    0.6.2
 */