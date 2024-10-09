package com.cooksys.project1.mappers;

import com.cooksys.project1.dtos.HashtagDto;
import com.cooksys.project1.entities.HashTag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-09T15:36:25-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class HashtagMapperImpl implements HashtagMapper {

    @Override
    public HashtagDto entityToDto(HashTag entity) {
        if ( entity == null ) {
            return null;
        }

        HashtagDto hashtagDto = new HashtagDto();

        hashtagDto.setLabel( entity.getLabel() );
        hashtagDto.setFirstUsed( entity.getFirstUsed() );
        hashtagDto.setLastUsed( entity.getLastUsed() );

        return hashtagDto;
    }

    @Override
    public List<HashtagDto> entitiesToDtos(List<HashTag> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HashtagDto> list = new ArrayList<HashtagDto>( entities.size() );
        for ( HashTag hashTag : entities ) {
            list.add( entityToDto( hashTag ) );
        }

        return list;
    }
}
