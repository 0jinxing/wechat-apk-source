package com.tencent.ttpic.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoFilterBase$SHADER_FIELD
{
  public String name;

  static
  {
    AppMethodBeat.i(83077);
    CANVAS_SIZE = new SHADER_FIELD("CANVAS_SIZE", 0, "canvasSize");
    FACE_DETECT_IMAGE_SIZE = new SHADER_FIELD("FACE_DETECT_IMAGE_SIZE", 1, "faceDetectImageSize");
    FACE_POINT = new SHADER_FIELD("FACE_POINT", 2, "facePoints");
    FACE_ACTION_TYPE = new SHADER_FIELD("FACE_ACTION_TYPE", 3, "faceActionType");
    FRAME_DURATION = new SHADER_FIELD("FRAME_DURATION", 4, "frameDuration");
    ELEMENT_DURATIONS = new SHADER_FIELD("ELEMENT_DURATIONS", 5, "elementDurations");
    AUDIO_POWER_SCALE = new SHADER_FIELD("AUDIO_POWER_SCALE", 6, "audioPowerScale");
    $VALUES = new SHADER_FIELD[] { CANVAS_SIZE, FACE_DETECT_IMAGE_SIZE, FACE_POINT, FACE_ACTION_TYPE, FRAME_DURATION, ELEMENT_DURATIONS, AUDIO_POWER_SCALE };
    AppMethodBeat.o(83077);
  }

  private VideoFilterBase$SHADER_FIELD(String paramString)
  {
    this.name = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.VideoFilterBase.SHADER_FIELD
 * JD-Core Version:    0.6.2
 */