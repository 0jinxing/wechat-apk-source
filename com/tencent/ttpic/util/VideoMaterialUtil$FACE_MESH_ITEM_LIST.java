package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum VideoMaterialUtil$FACE_MESH_ITEM_LIST
{
  public String value;

  static
  {
    AppMethodBeat.i(84089);
    ID = new FACE_MESH_ITEM_LIST("ID", 0, "id");
    PERSON_ID = new FACE_MESH_ITEM_LIST("PERSON_ID", 1, "personID");
    FRAMES = new FACE_MESH_ITEM_LIST("FRAMES", 2, "frames");
    $VALUES = new FACE_MESH_ITEM_LIST[] { ID, PERSON_ID, FRAMES };
    AppMethodBeat.o(84089);
  }

  private VideoMaterialUtil$FACE_MESH_ITEM_LIST(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.FACE_MESH_ITEM_LIST
 * JD-Core Version:    0.6.2
 */