package com.tencent.mm.plugin.story.c.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.f.a;
import java.util.HashSet;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryBasicElementConfig$StoryBasicConfig;", "", "repeatMD5", "", "showMusicIcon", "", "albumThumbHeight", "albumThumbWidth", "(IZII)V", "getAlbumThumbHeight", "()I", "setAlbumThumbHeight", "(I)V", "getAlbumThumbWidth", "setAlbumThumbWidth", "enableFavorite", "getEnableFavorite", "()Z", "setEnableFavorite", "(Z)V", "enableReply", "getEnableReply", "setEnableReply", "enableSnsNotify", "getEnableSnsNotify", "setEnableSnsNotify", "favExpiredTime", "getFavExpiredTime", "setFavExpiredTime", "regex", "", "getRegex", "()Ljava/lang/String;", "getRepeatMD5", "setRepeatMD5", "getShowMusicIcon", "setShowMusicIcon", "showSet", "Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/story/api/IStoryBasicConfig$SnsPositionType;", "getShowSet", "()Ljava/util/HashSet;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "plugin-story_release"})
public final class a$a
{
  final HashSet<f.a> rRa;
  boolean rRb;
  boolean rRc;
  boolean rRd;
  public int rRe;
  private int rRf;
  public boolean rRg;
  public int rRh;
  public int rRi;
  final String regex;

  private a$a()
  {
    AppMethodBeat.i(108946);
    this.rRf = 2;
    this.rRg = true;
    this.rRh = 0;
    this.rRi = 0;
    this.rRa = new HashSet();
    this.regex = "#冒泡#";
    this.rRe = 15552000;
    AppMethodBeat.o(108946);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this != paramObject)
    {
      bool2 = bool1;
      if (!(paramObject instanceof a))
        break label107;
      paramObject = (a)paramObject;
      if (this.rRf != paramObject.rRf)
        break label109;
      i = 1;
      bool2 = bool1;
      if (i == 0)
        break label107;
      if (this.rRg != paramObject.rRg)
        break label115;
      i = 1;
      label56: bool2 = bool1;
      if (i == 0)
        break label107;
      if (this.rRh != paramObject.rRh)
        break label121;
      i = 1;
      label77: bool2 = bool1;
      if (i == 0)
        break label107;
      if (this.rRi != paramObject.rRi)
        break label127;
    }
    label107: label109: label115: label121: label127: for (int i = 1; ; i = 0)
    {
      bool2 = bool1;
      if (i != 0)
        bool2 = true;
      return bool2;
      i = 0;
      break;
      i = 0;
      break label56;
      i = 0;
      break label77;
    }
  }

  public final int hashCode()
  {
    int i = this.rRf;
    int j = this.rRg;
    int k = j;
    if (j != 0)
      k = 1;
    return ((k + i * 31) * 31 + this.rRh) * 31 + this.rRi;
  }

  public final String toString()
  {
    AppMethodBeat.i(108947);
    String str = "StoryBasicConfig(repeatMD5=" + this.rRf + ", showMusicIcon=" + this.rRg + ", albumThumbHeight=" + this.rRh + ", albumThumbWidth=" + this.rRi + ")";
    AppMethodBeat.o(108947);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.a.a
 * JD-Core Version:    0.6.2
 */