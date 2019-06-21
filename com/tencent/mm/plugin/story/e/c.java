package com.tencent.mm.plugin.story.e;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/data/StoryUtil;", "", "()V", "Companion", "plugin-story_release"})
public final class c
{
  private static final String TAG = "MicroMsg.StoryUtil";
  private static final String qGf = "storyb";
  private static final String rRP = "Locall_path";
  private static final float rRQ = -1000.0F;
  private static final String rRR = "story_respone_count";
  public static final c.a rRS;

  static
  {
    AppMethodBeat.i(108997);
    rRS = new c.a((byte)0);
    TAG = "MicroMsg.StoryUtil";
    rRP = "Locall_path";
    rRQ = -1000.0F;
    qGf = "storyb";
    rRR = "story_respone_count";
    AppMethodBeat.o(108997);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/data/StoryUtil$Companion$VideoInfo;", "", "width", "", "height", "duration", "rotate", "videoBitrate", "fps", "matchScreenRatio", "", "(IIIIIIZ)V", "getDuration", "()I", "getFps", "getHeight", "getMatchScreenRatio", "()Z", "getRotate", "getVideoBitrate", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "plugin-story_release"})
  public static final class a$a
  {
    public final int duration;
    public final int fps;
    public final int height;
    public final boolean rRT;
    private final int rotate;
    public final int videoBitrate;
    public final int width;

    public a$a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
    {
      this.width = paramInt1;
      this.height = paramInt2;
      this.duration = paramInt3;
      this.rotate = paramInt4;
      this.videoBitrate = paramInt5;
      this.fps = paramInt6;
      this.rRT = paramBoolean;
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      boolean bool2;
      if (this != paramObject)
      {
        bool2 = bool1;
        if (!(paramObject instanceof a))
          break label170;
        paramObject = (a)paramObject;
        if (this.width != paramObject.width)
          break label172;
        i = 1;
        bool2 = bool1;
        if (i == 0)
          break label170;
        if (this.height != paramObject.height)
          break label178;
        i = 1;
        label56: bool2 = bool1;
        if (i == 0)
          break label170;
        if (this.duration != paramObject.duration)
          break label184;
        i = 1;
        label77: bool2 = bool1;
        if (i == 0)
          break label170;
        if (this.rotate != paramObject.rotate)
          break label190;
        i = 1;
        label98: bool2 = bool1;
        if (i == 0)
          break label170;
        if (this.videoBitrate != paramObject.videoBitrate)
          break label196;
        i = 1;
        label119: bool2 = bool1;
        if (i == 0)
          break label170;
        if (this.fps != paramObject.fps)
          break label202;
        i = 1;
        label140: bool2 = bool1;
        if (i == 0)
          break label170;
        if (this.rRT != paramObject.rRT)
          break label208;
      }
      label170: label172: label178: label184: label190: label196: label202: label208: for (int i = 1; ; i = 0)
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
        i = 0;
        break label98;
        i = 0;
        break label119;
        i = 0;
        break label140;
      }
    }

    public final int hashCode()
    {
      int i = this.width;
      int j = this.height;
      int k = this.duration;
      int m = this.rotate;
      int n = this.videoBitrate;
      int i1 = this.fps;
      int i2 = this.rRT;
      int i3 = i2;
      if (i2 != 0)
        i3 = 1;
      return i3 + (((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31;
    }

    public final String toString()
    {
      AppMethodBeat.i(108993);
      String str = "VideoInfo(width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", rotate=" + this.rotate + ", videoBitrate=" + this.videoBitrate + ", fps=" + this.fps + ", matchScreenRatio=" + this.rRT + ")";
      AppMethodBeat.o(108993);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.e.c
 * JD-Core Version:    0.6.2
 */