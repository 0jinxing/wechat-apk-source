package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$MoovReadyInfo;", "", "isMoovReady", "", "offset", "", "length", "preloadFinish", "(ZJJZ)V", "()Z", "getLength", "()J", "getOffset", "getPreloadFinish", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "plugin-story_release"})
public final class n$b
{
  final long bgY;
  final boolean sqw;
  final boolean sqx;
  final long xb;

  public n$b(boolean paramBoolean1, long paramLong1, long paramLong2, boolean paramBoolean2)
  {
    this.sqw = paramBoolean1;
    this.xb = paramLong1;
    this.bgY = paramLong2;
    this.sqx = paramBoolean2;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this != paramObject)
    {
      bool2 = bool1;
      if (!(paramObject instanceof b))
        break label109;
      paramObject = (b)paramObject;
      if (this.sqw != paramObject.sqw)
        break label111;
      i = 1;
      bool2 = bool1;
      if (i == 0)
        break label109;
      if (this.xb != paramObject.xb)
        break label117;
      i = 1;
      label57: bool2 = bool1;
      if (i == 0)
        break label109;
      if (this.bgY != paramObject.bgY)
        break label123;
      i = 1;
      label79: bool2 = bool1;
      if (i == 0)
        break label109;
      if (this.sqx != paramObject.sqx)
        break label129;
    }
    label129: for (int i = 1; ; i = 0)
    {
      bool2 = bool1;
      if (i != 0)
        bool2 = true;
      label109: return bool2;
      label111: i = 0;
      break;
      label117: i = 0;
      break label57;
      label123: i = 0;
      break label79;
    }
  }

  public final int hashCode()
  {
    int i = 1;
    int j = this.sqw;
    boolean bool = j;
    if (j != 0)
      bool = true;
    long l = this.xb;
    int k = (int)(l ^ l >>> 32);
    l = this.bgY;
    int m = (int)(l ^ l >>> 32);
    j = this.sqx;
    if (j != 0);
    while (true)
    {
      return ((bool * true + k) * 31 + m) * 31 + i;
      i = j;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(110875);
    String str = "MoovReadyInfo(isMoovReady=" + this.sqw + ", offset=" + this.xb + ", length=" + this.bgY + ", preloadFinish=" + this.sqx + ")";
    AppMethodBeat.o(110875);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.n.b
 * JD-Core Version:    0.6.2
 */