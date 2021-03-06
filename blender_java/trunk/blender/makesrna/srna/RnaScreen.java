package blender.makesrna.srna;

import static blender.makesrna.RNATypes.*;
import static blender.makesrna.RnaRna.*;
import static blender.makesrna.RnaAccess.*;
import static blender.makesrna.RnaScreenUtil.rna_Screen_fullscreen_get;
import static blender.makesrna.RnaScreenUtil.rna_Screen_is_animation_playing_get;
import static blender.makesrna.RnaScreenUtil.rna_Screen_scene_set;
import static blender.makesrna.RnaScreenUtil.rna_Screen_scene_update;

import blender.blenlib.ListBaseUtil;
import blender.makesrna.rna_internal_types.*;
import blender.makesdna.sdna.ListBase;
import blender.makesdna.sdna.bScreen;

public class RnaScreen extends RnaStruct {
	
	public RnaScreen(PointerRNA ptr) {
		super(ptr);
	}
	
	public boolean getIs_animation_playing() {
		return rna_Screen_is_animation_playing_get(ptr);
	}
	
	public boolean getShow_fullscreen() {
		return rna_Screen_fullscreen_get(ptr);
	}
	
	/* Autogenerated Functions */
	
	private static PropCollectionGetFunc Screen_rna_properties_get = new PropCollectionGetFunc() {
	public PointerRNA get(CollectionPropertyIterator iter)
	{
		return rna_builtin_properties_get.get(iter);
	}};
	
	private static PropCollectionBeginFunc Screen_rna_properties_begin = new PropCollectionBeginFunc() {
	public void begin(CollectionPropertyIterator iter, PointerRNA ptr)
	{

		iter.clear();
		iter.parent= ptr;
		iter.prop= (PropertyRNA)rna_Screen_rna_properties;

		rna_builtin_properties_begin.begin(iter, ptr);

		if(iter.valid)
			iter.ptr= Screen_rna_properties_get.get(iter);
	}};
	
	private static PropCollectionNextFunc Screen_rna_properties_next = new PropCollectionNextFunc() {
	public void next(CollectionPropertyIterator iter)
	{
		rna_builtin_properties_next.next(iter);

		if(iter.valid)
			iter.ptr= Screen_rna_properties_get.get(iter);
	}};
	
	private static PropCollectionEndFunc Screen_rna_properties_end = new PropCollectionEndFunc() {
	public void end(CollectionPropertyIterator iter)
	{
		rna_iterator_listbase_end.end(iter);
	}};
	
	private static PropPointerGetFunc Screen_rna_type_get = new PropPointerGetFunc() {
	public PointerRNA getPtr(PointerRNA ptr)
	{
		return rna_builtin_type_get.getPtr(ptr);
	}};
	
	private static PropPointerGetFunc Screen_scene_get = new PropPointerGetFunc() {
	public PointerRNA getPtr(PointerRNA ptr)
	{
		bScreen data= (bScreen)(ptr.data);
		return rna_pointer_inherit_refine(ptr, RNA_null, data.scene);
	}};

	private static PropPointerSetFunc Screen_scene_set = new PropPointerSetFunc() {
	public void setPtr(PointerRNA ptr, PointerRNA value)
	{
		rna_Screen_scene_set.setPtr(ptr, value);
	}};
	
	private static PropCollectionGetFunc Screen_areas_get = new PropCollectionGetFunc() {
	public PointerRNA get(CollectionPropertyIterator iter)
	{
		return null;
	}};

	private static PropCollectionBeginFunc Screen_areas_begin = new PropCollectionBeginFunc() {
	public void begin(CollectionPropertyIterator iter, PointerRNA ptr)
	{
		bScreen data= (bScreen)(ptr.data);

		iter.clear();
		iter.parent= ptr;
		iter.prop= (PropertyRNA)rna_Screen_areas;

		rna_iterator_listbase_begin(iter, data.areabase, null);

		if(iter.valid)
			iter.ptr= Screen_areas_get.get(iter);
	}};

	private static PropCollectionEndFunc Screen_areas_end = new PropCollectionEndFunc() {
	public void end(CollectionPropertyIterator iter)
	{
	}};
	
	private static PropBooleanGetFunc Screen_is_animation_playing_get = new PropBooleanGetFunc() {
	public boolean getBool(PointerRNA ptr)
	{
		return rna_Screen_is_animation_playing_get(ptr);
	}
	public String getName() { return "Screen_is_animation_playing_get"; }
	};
	
	private static PropBooleanGetFunc Screen_show_fullscreen_get = new PropBooleanGetFunc() {
	public boolean getBool(PointerRNA ptr)
	{
		return rna_Screen_fullscreen_get(ptr);
	}
	public String getName() { return "Screen_show_fullscreen_get"; }
	};
	
	/* Screen */
	private static CollectionPropertyRNA rna_Screen_rna_properties = new CollectionPropertyRNA(
		null, null,
		-1, "rna_properties", 128, "Properties",
		"RNA property collection",
		0,
		PROP_COLLECTION, PROP_NONE|PROP_UNIT_NONE, null, 0, new int[]{0, 0, 0}, 0,
		null, 0, null, null,
		0, -1, null,
		Screen_rna_properties_begin, Screen_rna_properties_next, Screen_rna_properties_end, Screen_rna_properties_get, null, null, rna_builtin_properties_lookup_string, RnaProperty.RNA_Property
	);
	
	private static PointerPropertyRNA rna_Screen_rna_type = new PointerPropertyRNA(
		null, null,
		-1, "rna_type", 524288, "RNA",
		"RNA type definition",
		0,
		PROP_POINTER, PROP_NONE|PROP_UNIT_NONE, null, 0, new int[]{0, 0, 0}, 0,
		null, 0, null, null,
		0, -1, null,
		Screen_rna_type_get, null, null, null,RnaStruct.RNA_Struct
	);
	
	private static PointerPropertyRNA rna_Screen_scene = new PointerPropertyRNA(
		null, null,
		-1, "scene", 4456449, "Scene",
		"Active scene to be edited in the screen",
		0,
		PROP_POINTER, PROP_NONE|PROP_UNIT_NONE, null, 0, new int[]{0, 0, 0}, 0,
		rna_Screen_scene_update, 0, null, null,
		0, -1, null,
		Screen_scene_get, Screen_scene_set, null, null,null
	);
	
	private static CollectionPropertyRNA rna_Screen_areas = new CollectionPropertyRNA(
		null, null,
		-1, "areas", 0, "Areas",
		"Areas the screen is subdivided into",
		0,
		PROP_COLLECTION, PROP_NONE|PROP_UNIT_NONE, null, 0, new int[]{0, 0, 0}, 0,
		null, 0, null, null,
		0, -1, null,
		Screen_areas_begin, null, Screen_areas_end, Screen_areas_get, null, null, null, RnaArea.RNA_Area
	);
	
	private static BooleanPropertyRNA rna_Screen_is_animation_playing = new BooleanPropertyRNA(
		null, null,
		-1, "is_animation_playing", 2, "Animation Playing",
		"Animation playback is active",
		0,
		PROP_BOOLEAN, PROP_NONE|PROP_UNIT_NONE, null, 0, new int[]{0, 0, 0}, 0,
		null, 0, null, null,
		0, -1, null,
		Screen_is_animation_playing_get, null, null, null, false, null
	);
	
	private static BooleanPropertyRNA rna_Screen_show_fullscreen = new BooleanPropertyRNA(
		null, null,
		-1, "show_fullscreen", 2, "Fullscreen",
		"An area is maximised, filling this screen",
		0,
		PROP_BOOLEAN, PROP_NONE|PROP_UNIT_NONE, null, 0, new int[]{0, 0, 0}, 0,
		null, 0, null, null,
		0, -1, null,
		Screen_show_fullscreen_get, null, null, null, false, null
	);
	
	static { ListBase tmp = new ListBase();
		ListBaseUtil.BLI_addtail(tmp, rna_Screen_rna_properties);
		ListBaseUtil.BLI_addtail(tmp, rna_Screen_rna_type);
		ListBaseUtil.BLI_addtail(tmp, rna_Screen_scene);
		ListBaseUtil.BLI_addtail(tmp, rna_Screen_areas);
		ListBaseUtil.BLI_addtail(tmp, rna_Screen_is_animation_playing);
		ListBaseUtil.BLI_addtail(tmp, rna_Screen_show_fullscreen);
	}
	
	public static StructRNA RNA_Screen = new StructRNA(
		RnaArea.RNA_Area, RnaToolSettings.RNA_ToolSettings,
		null,
		rna_Screen_rna_properties, rna_Screen_show_fullscreen,
		null,null,
		"Screen", 0, "Screen", "Screen datablock, defining the layout of areas in a window",
		27,
		null, rna_Screen_rna_properties,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null, null
	);
	
}
