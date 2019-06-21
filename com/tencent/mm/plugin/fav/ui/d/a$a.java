package com.tencent.mm.plugin.fav.ui.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import java.util.Map;

public final class a$a
{
  public String ema;
  public boolean jLC;
  public long lastUpdateTime;
  public boolean mlh;
  public Map<Long, g> mli;
  public boolean mlp;
  public a.c moG;

  public final String toString()
  {
    AppMethodBeat.i(74614);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("lastUpdateTime:").append(this.lastUpdateTime).append('\n');
    ((StringBuilder)localObject).append("isSearching:").append(this.jLC).append('\n');
    ((StringBuilder)localObject).append("search str:").append(this.ema).append('\n');
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(74614);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.a.a
 * JD-Core Version:    0.6.2
 */